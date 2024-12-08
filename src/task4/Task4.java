package task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Task4 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть шлях до файлу: ");
        String filePath = scanner.nextLine();

        System.out.print("Введіть масив цілих чисел через пробіл: ");
        int[] array = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        try {
            StringBuilder content = new StringBuilder();
            content.append(Arrays.toString(array).replaceAll("[\\[\\],]", "")).append(System.lineSeparator());
            content.append(Arrays.stream(array).filter(n -> n % 2 == 0).mapToObj(String::valueOf).reduce((a, b) -> a + " " + b).orElse("")).append(System.lineSeparator());
            content.append(Arrays.stream(array).filter(n -> n % 2 != 0).mapToObj(String::valueOf).reduce((a, b) -> a + " " + b).orElse("")).append(System.lineSeparator());
            content.append(Arrays.toString(reverseArray(array)).replaceAll("[\\[\\],]", ""));

            Files.writeString(Path.of(filePath), content.toString());
            System.out.println("Дані успішно записані до файлу.");
        } catch (IOException e) {
            System.out.println("Помилка запису файлу: " + e.getMessage());
        }
    }

    private static int[] reverseArray(int[] array) {
        int[] reversed = Arrays.copyOf(array, array.length);
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = reversed[i];
            reversed[i] = reversed[j];
            reversed[j] = temp;
        }
        return reversed;
    }
}
