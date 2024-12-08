import task1.Task1;
import task2.Task2;
import task3.Task3;
import task4.Task4;
import task5.Task5;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Головне меню ===");
            System.out.println("1. Завдання 1: Порівняння файлів");
            System.out.println("2. Завдання 2: Найдовша строка у файлі");
            System.out.println("3. Завдання 3: Обробка масивів з файлу");
            System.out.println("4. Завдання 4: Запис масивів у файл");
            System.out.println("5. Завдання 5: Інформаційна система «Корпорація»");
            System.out.println("0. Вийти");
            System.out.print("Оберіть опцію: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> Task1.run();
                case 2 -> Task2.run();
                case 3 -> Task3.run();
                case 4 -> Task4.run();
                case 5 -> Task5.run();
                case 0 -> {
                    running = false;
                    System.out.println("Програма завершена.");
                }
                default -> System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        }
        scanner.close();
    }
}
