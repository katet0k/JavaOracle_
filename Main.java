import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Виклик методів для роботи з List
        ListOperations listOperations = new ListOperations();
        listOperations.runListTasks();

        // Виклик методів для роботи з Set
        SetOperations setOperations = new SetOperations();
        setOperations.runSetTasks();

        // Виклик методів для роботи з Map
        MapOperations mapOperations = new MapOperations();
        mapOperations.runMapTasks();

        // Робота з класом User
        UserOperations userOperations = new UserOperations();
        userOperations.runUserTasks();
    }
}
