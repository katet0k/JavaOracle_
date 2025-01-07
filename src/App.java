import writers.NoticeWriter;
import readers.InfoReader;
import readers.WarnReader;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Меню ===");
        System.out.println("1. Запустити NoticeWriter (запис у БД)");
        System.out.println("2. Запустити InfoReader (читання INFO)");
        System.out.println("3. Запустити WarnReader (читання WARN)");
        System.out.println("0. Вийти");
        System.out.print("Ваш вибір: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Запуск NoticeWriter...");
                NoticeWriter.main(args);
            }
            case 2 -> {
                System.out.println("Запуск InfoReader...");
                InfoReader.main(args);
            }
            case 3 -> {
                System.out.println("Запуск WarnReader...");
                WarnReader.main(args);
            }
            case 0 -> {
                System.out.println("Вихід з програми.");
                System.exit(0);
            }
            default -> System.out.println("Невірний вибір! Спробуйте знову.");
        }
    }
}
