package task2;

import java.util.*;
import java.util.stream.Collectors;

public class Task2 {
    public static void run() {
        System.out.println("=== Завдання 2: Продукти ===");
        List<String> products = Arrays.asList("Молоко", "Хліб", "Сир", "Яблуко", "Молоко", "Сік", "Ковбаса");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Список продуктів: " + products);

        // Назви < 5 символів
        System.out.println("Продукти з назвою < 5 символів: " +
                products.stream().filter(p -> p.length() < 5).collect(Collectors.toList()));

        // Кількість введеного продукту
        System.out.print("Введіть назву продукту: ");
        String inputProduct = scanner.nextLine();
        long count = products.stream().filter(p -> p.equalsIgnoreCase(inputProduct)).count();
        System.out.println("Кількість продукту \"" + inputProduct + "\": " + count);

        // Продукти на задану букву
        System.out.print("Введіть першу букву: ");
        String firstLetter = scanner.nextLine();
        System.out.println("Продукти на \"" + firstLetter + "\": " +
                products.stream().filter(p -> p.startsWith(firstLetter)).collect(Collectors.toList()));

        // Продукти категорії "Молоко"
        System.out.println("Продукти категорії 'Молоко': " +
                products.stream().filter(p -> p.equalsIgnoreCase("Молоко")).collect(Collectors.toList()));
    }
}
