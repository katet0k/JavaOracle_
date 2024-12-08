package race;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class RaceCarRunnable extends Car implements Runnable {
    private int passed = 0;  // Пройденное расстояние
    private final int distance;  // Дистанция гонки
    private boolean isFinish = false;  // Флаг завершения гонки
    private final CountDownLatch latch;  // Счетчик для синхронизации

    public RaceCarRunnable(String name, int maxSpeed, int distance, CountDownLatch latch) {
        super(name, maxSpeed);
        this.distance = distance;
        this.latch = latch;
    }

    // Генерация случайной скорости от maxSpeed / 2 до maxSpeed
    public int getRandomSpeed() {
        Random random = new Random();
        return random.nextInt(maxSpeed / 2, maxSpeed);
    }

    @Override
    public void run() {
        while (!isFinish) {
            try {
                int speed = getRandomSpeed();
                passed += speed;  // Добавляем скорость к пройденному расстоянию
                System.out.println(String.format("%s => speed: %d; progress: %d/%d", name, speed, passed, distance));
                
                if (passed >= distance) {
                    isFinish = true;
                    System.out.println(name + " FINISHED!");
                    latch.countDown();  // Уменьшаем счетчик по достижении финиша
                }

                Thread.sleep(1000);  // Засыпаем на 1 секунду
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public boolean isFinish() {
        return isFinish;
    }

    public long getFinishTime() {
        return System.currentTimeMillis() - Race.startRaceTime.get();
    }
}
