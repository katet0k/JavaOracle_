package task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void run() {
        System.out.println("=== Завдання 3: Пристрої ===");
        List<Device> devices = Arrays.asList(
                new Device("Телефон", 2020, 500.0, "Чорний", "Гаджет"),
                new Device("Ноутбук", 2021, 1000.0, "Сірий", "Комп'ютер"),
                new Device("Планшет", 2022, 700.0, "Білий", "Гаджет"),
                new Device("Монітор", 2019, 300.0, "Чорний", "Дисплей")
        );

        System.out.println("Усі пристрої: " + devices);
        System.out.println("Пристрої чорного кольору: " +
                devices.stream().filter(d -> d.getColor().equalsIgnoreCase("Чорний")).collect(Collectors.toList()));
        System.out.println("Пристрої 2021 року: " +
                devices.stream().filter(d -> d.getYear() == 2021).collect(Collectors.toList()));
        System.out.println("Пристрої дорожче 500: " +
                devices.stream().filter(d -> d.getPrice() > 500).collect(Collectors.toList()));
        System.out.println("Пристрої типу 'Гаджет': " +
                devices.stream().filter(d -> d.getType().equalsIgnoreCase("Гаджет")).collect(Collectors.toList()));
    }
}
