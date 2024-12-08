import java.util.*;

public class SetOperations {
    public void runSetTasks() {
        // 2a. Создать HashSet<String> (set1)
        HashSet<String> set1 = new HashSet<>();

        // 2b. Вставить в set 2 произвольные строки
        set1.add("Hello");
        set1.add("World");

        // 2c. Вставить в set все элементы из list1 и list2
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Date", "Elderberry", "Fig"));
        set1.addAll(list1);
        set1.addAll(list2);

        // 2d. Вывести на экран значения set-a
        System.out.println("Set1: " + set1);

        // 2e. Создать LinkedHashSet<String> (set2)
        LinkedHashSet<String> set2 = new LinkedHashSet<>();

        // 2f. Вставить в set все элементы из list2 и list3
        List<String> list3 = Arrays.asList("Date", "Elderberry", "Fig");
        set2.addAll(list2);
        set2.addAll(list3);

        // 2g. Вывести на экран значения set-a
        System.out.println("Set2: " + set2);
    }
}
