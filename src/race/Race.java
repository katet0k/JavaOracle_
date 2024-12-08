package race;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;

public class Race {
    public static final AtomicLong startRaceTime = new AtomicLong();  // Статическое поле времени старта

    public static void main(String[] args) {
        List<RaceCarRunnable> cars = new ArrayList<>();
        List<Thread> threads = new ArrayList<>();
        int distance = 350;  // Примерная длина трассы

        // Добавляем несколько гоночных машин
        cars.add(new RaceCarRunnable("Car 1", 200, distance, null));
        cars.add(new RaceCarRunnable("Car 2", 180, distance, null));
        cars.add(new RaceCarRunnable("Car 3", 220, distance, null));

        // Создаем счетчик для синхронизации финиша
        CountDownLatch latch = new CountDownLatch(cars.size());

        // Добавляем машины и их потоки
        for (RaceCarRunnable car : cars) {
            car = new RaceCarRunnable(car.getName(), car.getMaxSpeed(), distance, latch);
            threads.add(new Thread(car));
        }

        // Стартуем гонку
        startRace(threads);

        // Ожидаем, пока все машины не финишируют
        try {
            latch.await();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Выводим результаты после завершения гонки
        long winnerTime = Long.MAX_VALUE;
        RaceCarRunnable winnerCar = null;
        for (RaceCarRunnable car : cars) {
            if (car.isFinish()) {
                System.out.println(car.getName() + " finished with time: " + convertToTime(car.getFinishTime()));
                if (car.getFinishTime() < winnerTime) {
                    winnerTime = car.getFinishTime();
                    winnerCar = car;
                }
            }
        }

        System.out.println("Winner: " + winnerCar.getName() + " with time: " + convertToTime(winnerCar.getFinishTime()));
    }

    public static void startRace(List<Thread> cars) {
        // Поток отсчета до старта
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("3...");
                    Thread.sleep(500);
                    System.out.println("2...");
                    Thread.sleep(500);
                    System.out.println("1...");
                    Thread.sleep(500);
                    System.out.println("GO!!!");

                    // Стартуем все потоки машин
                    for (Thread thread : cars) {
                        thread.start();
                    }

                    startRaceTime.set(System.currentTimeMillis());  // Записываем время старта гонки
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }).start();
    }

    public static String convertToTime(long time) {
        long minutes = (time / 1000) / 60;
        long seconds = (time / 1000) % 60;
        long milliseconds = time % 1000;

        return String.format("%02d:%02d:%03d", minutes, seconds, milliseconds);
    }
}
