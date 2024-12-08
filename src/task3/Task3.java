package task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть шлях до файлу: ");
        String filePath = scanner.nextLine();

        try {
            List<String> lines = Files.readAllLines(Path.of(filePath));
            int[][] arrays = lines.stream()
                    .map(line -> Arrays.stream(line.split("\\s+"))
                            .mapToInt(Integer::parseInt)
                            .toArray())
                    .toArray(int[][]::new);

            int totalSum = 0;
            int globalMax = Integer.MIN_VALUE;
            int globalMin = Integer.MAX_VALUE;

            for (int[] array : arrays) {
                int arraySum = Arrays.stream(array).sum();
                int arrayMax = Arrays.stream(array).max().orElse(Integer.MIN_VALUE);
                int arrayMin = Arrays.stream(array).min().orElse(Integer.MAX_VALUE);

                totalSum += arraySum;
                globalMax = Math.max(globalMax, arrayMax);
                globalMin = Math.min(globalMin, arrayMin);

                System.out.println("Масив: " + Arrays.toString(array));
                System.out.printf("Сума: %d, Максимум: %d, Мінімум: %d%n", arraySum, arrayMax, arrayMin);
            }

            System.out.printf("Загальна сума: %d, Глобальний максимум: %d, Глобальний мінімум: %d%n",
                    totalSum, globalMax, globalMin);
        } catch (IOException e) {
            System.out.println("Помилка читання файлу: " + e.getMessage());
        }
    }
}
