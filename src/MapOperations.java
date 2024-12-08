import java.util.*;

public class MapOperations {
    public void runMapTasks() {
        // 3a. Создать LinkedHashMap<Integer, String> (map1)
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();

        // 3b. Добавить в map значения всех месяцев года
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        for (int i = 0; i < months.length; i++) {
            map1.put(i, months[i]);
        }

        // 3c. Вывести на экран первый и последний месяц года
        System.out.println("First month: " + map1.get(0));
        System.out.println("Last month: " + map1.get(11));

        // 3d. Вставить на место 6-го месяца слово 'ОТПУСК'
        map1.put(5, "ОТПУСК");
        System.out.println("Map1 after update: " + map1);

        // 3e. Создать HashMap<Integer, String> (map2)
        HashMap<Integer, String> map2 = new HashMap<>(map1);

        // 3g. Вывести на экран map1 и map2
        System.out.println("Map1: " + map1);
        System.out.println("Map2: " + map2);
    }
}
