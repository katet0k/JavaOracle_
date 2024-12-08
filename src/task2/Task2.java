package task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Task2 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть шлях до файлу: ");
        String filePath = scanner.nextLine();

        try {
            List<String> lines = Files.readAllLines(Path.of(filePath));
            String longestLine = lines.stream()
                    .max((line1, line2) -> Integer.compare(line1.length(), line2.length()))
                    .orElse("Файл порожній");

            System.out.printf("Найдовший рядок (%d символів): %s%n", longestLine.length(), longestLine);
        } catch (IOException e) {
            System.out.println("Помилка читання файлу: " + e.getMessage());
        }
    }
}
