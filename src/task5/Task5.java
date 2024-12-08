package task5;

import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть шлях до файлу з даними співробітників: ");
        String filePath = scanner.nextLine();

        Corporation corporation = new Corporation(filePath);

        boolean running = true;

        while (running) {
            System.out.println("\n=== Меню корпорації ===");
            System.out.println("1. Додати співробітника");
            System.out.println("2. Видалити співробітника");
            System.out.println("3. Оновити співробітника");
            System.out.println("4. Пошук співробітника за прізвищем");
            System.out.println("5. Показати всіх співробітників");
            System.out.println("6. Пошук співробітників за віком");
            System.out.println("7. Пошук співробітників за першим літером прізвища");
            System.out.println("0. Вийти");
            System.out.print("Оберіть опцію: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Введіть прізвище співробітника: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Введіть ім'я співробітника: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Введіть вік співробітника: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline
                    System.out.print("Введіть посаду співробітника: ");
                    String position = scanner.nextLine();

                    Employee employee = new Employee(lastName, firstName, age, position);
                    corporation.addEmployee(employee);
                    System.out.println("Співробітника додано.");
                }
                case 2 -> {
                    System.out.print("Введіть прізвище співробітника для видалення: ");
                    String lastName = scanner.nextLine();
                    corporation.removeEmployee(lastName);
                    System.out.println("Співробітника видалено.");
                }
                case 3 -> {
                    System.out.print("Введіть прізвище співробітника для оновлення: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Введіть нове ім'я: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Введіть новий вік: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline
                    System.out.print("Введіть нову посаду: ");
                    String position = scanner.nextLine();

                    Employee updatedEmployee = new Employee(lastName, firstName, age, position);
                    corporation.updateEmployee(lastName, updatedEmployee);
                    System.out.println("Дані співробітника оновлено.");
                }
                case 4 -> {
                    System.out.print("Введіть прізвище співробітника для пошуку: ");
                    String lastName = scanner.nextLine();
                    Employee employee = corporation.findEmployeeByLastName(lastName);
                    if (employee != null) {
                        System.out.println("Знайдений співробітник: " + employee);
                    } else {
                        System.out.println("Співробітника не знайдено.");
                    }
                }
                case 5 -> corporation.displayAllEmployees();
                case 6 -> {
                    System.out.print("Введіть вік для пошуку співробітників: ");
                    int age = scanner.nextInt();
                    List<Employee> employeesByAge = corporation.findEmployeesByAge(age);
                    corporation.displayEmployees(employeesByAge);
                }
                case 7 -> {
                    System.out.print("Введіть першу літеру прізвища для пошуку: ");
                    char letter = scanner.nextLine().charAt(0);
                    List<Employee> employeesByLetter = corporation.findEmployeesByFirstLetter(letter);
                    corporation.displayEmployees(employeesByLetter);
                }
                case 0 -> {
                    corporation.saveEmployees();
                    running = false;
                    System.out.println("Програма завершена.");
                }
                default -> System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        }
    }
}
