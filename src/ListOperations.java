import java.util.*;

public class ListOperations {
    public void runListTasks() {
        // 1a. Создать ArrayList<String> (list1)
        ArrayList<String> list1 = new ArrayList<>();

        // 1b. Создать массив строк. Добавить в список все элементы массива (одним методом)
        String[] array = {"Apple", "Banana", "Cherry"};
        Collections.addAll(list1, array);

        // 1c. Создать новый (list2) ArrayList<String>, принициализировав его предыдущим списком
        ArrayList<String> list2 = new ArrayList<>(list1);

        // 1d. Создать список (list3) используя Arrays.asList(…)
        List<String> list3 = Arrays.asList("Date", "Elderberry", "Fig");

        // 1e. Вставить list3 в середину list2
        list2.addAll(list2.size() / 2, list3);

        // 1f. Отсортировать список по убыванию
        list2.sort(Comparator.reverseOrder());

        // 1g. Удалить каждый второй элемент списка используя listiterator
        ListIterator<String> iterator = list2.listIterator();
        boolean toDelete = false;
        while (iterator.hasNext()) {
            iterator.next();
            if (toDelete) iterator.remove();
            toDelete = !toDelete;
        }

        System.out.println("List2: " + list2);
    }
}
