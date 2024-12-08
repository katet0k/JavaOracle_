import java.util.HashSet;

public class UserOperations {
    public void runUserTasks() {
        // 4b. Создать userSet (HashSet<User>)
        HashSet<User> userSet = new HashSet<>();

        // 4c. Создать экземпляры класса User
        User user1 = new User("Alice", 25, "12345");
        User user2 = new User("Alice", 25, "12345");
        User user3 = new User("Alice", 30, "12345");

        // 4d. Добавить пользователей в userSet
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);

        // 4e. Вывести пользователей на экран
        System.out.println("Users: " + userSet);
    }
}
