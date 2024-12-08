import task1.Task1;
import task2.Task2;
import task3.Task3;
import task4.Task4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            try {
                System.out.println("\n=== Меню ===");
                System.out.println("1. Завдання 1: Обробка чисел");
                System.out.println("2. Завдання 2: Продукти");
                System.out.println("3. Завдання 3: Пристрої");
                System.out.println("4. Завдання 4: Проектори");
                System.out.println("0. Вийти");
                System.out.print("Оберіть опцію: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Помилка: Введіть число від 0 до 4.");
                    scanner.next(); 
                    continue;
                }

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> Task1.run();
                    case 2 -> Task2.run();
                    case 3 -> Task3.run();
                    case 4 -> Task4.run();
                    case 0 -> {
                        running = false;
                        System.out.println("Програма завершена.");
                    }
                    default -> System.out.println("Невірний вибір. Спробуйте ще раз.");
                }
            } catch (Exception e) {
                System.out.println("Сталася помилка: " + e.getMessage());
                scanner.nextLine(); 
            }
        }
        scanner.close();
    }
}
