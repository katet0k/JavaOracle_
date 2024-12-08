package task1;

import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть шлях до першого файлу: ");
        String path1 = scanner.nextLine();

        System.out.print("Введіть шлях до другого файлу: ");
        String path2 = scanner.nextLine();

        try {
            FileComparator.compareFiles(path1, path2);
        } catch (IOException e) {
            System.out.println("Помилка читання файлу: " + e.getMessage());
        }
    }
}
