package task4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void run() {
        System.out.println("=== Завдання 4: Проектори ===");
        List<Projector> projectors = Arrays.asList(
                new Projector("Epson X1", 2023, 1500.0, "Epson"),
                new Projector("Sony VPL", 2022, 2000.0, "Sony"),
                new Projector("LG ProBeam", 2023, 1800.0, "LG"),
                new Projector("BenQ TK800", 2021, 1200.0, "BenQ")
        );

        System.out.println("Усі проектори: " + projectors);
        System.out.println("Проектори бренду Sony: " +
                projectors.stream().filter(p -> p.getBrand().equalsIgnoreCase("Sony")).collect(Collectors.toList()));
        System.out.println("Проектори 2023 року: " +
                projectors.stream().filter(p -> p.getYear() == 2023).collect(Collectors.toList()));
        System.out.println("Проектори дорожче 1500: " +
                projectors.stream().filter(p -> p.getPrice() > 1500).collect(Collectors.toList()));
        System.out.println("Проектори за ціною (зростання): " +
                projectors.stream().sorted(Comparator.comparingDouble(Projector::getPrice)).collect(Collectors.toList()));
        System.out.println("Проектори за роком (спадання): " +
                projectors.stream().sorted(Comparator.comparingInt(Projector::getYear).reversed()).collect(Collectors.toList()));
    }
}
