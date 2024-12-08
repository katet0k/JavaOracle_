package task1;

import java.util.Arrays;

public class Task1 {
    public static void run() {
        System.out.println("=== Завдання 1: Обробка чисел ===");
        int[] numbers = {121, -45, 22, 4224, 35, -11, 99, -202};
        System.out.println("Вхідні числа: " + Arrays.toString(numbers));

        long positiveCount = Arrays.stream(numbers).filter(n -> n > 0).count();
        long negativeCount = Arrays.stream(numbers).filter(n -> n < 0).count();
        long twoDigitCount = Arrays.stream(numbers).filter(n -> Math.abs(n) >= 10 && Math.abs(n) < 100).count();
        long mirroredCount = Arrays.stream(numbers).filter(Task1::isMirrored).count();

        System.out.println("Кількість позитивних: " + positiveCount);
        System.out.println("Кількість негативних: " + negativeCount);
        System.out.println("Кількість двозначних: " + twoDigitCount);
        System.out.println("Кількість дзеркальних: " + mirroredCount);
    }

    private static boolean isMirrored(int number) {
        String str = String.valueOf(Math.abs(number));
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
