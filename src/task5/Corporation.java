package task5;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Corporation {
    private List<Employee> employees;
    private String filePath;

    public Corporation(String filePath) {
        this.filePath = filePath;
        this.employees = loadEmployees();
    }

    private List<Employee> loadEmployees() {
        List<Employee> employeesList = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            employeesList = (List<Employee>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Не вдалося завантажити список співробітників.");
        }
        return employeesList;
    }

    public void saveEmployees() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(employees);
        } catch (IOException e) {
            System.out.println("Не вдалося зберегти список співробітників.");
        }
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        saveEmployees();
    }

    public void removeEmployee(String lastName) {
        employees.removeIf(e -> e.getLastName().equals(lastName));
        saveEmployees();
    }

    public void updateEmployee(String lastName, Employee updatedEmployee) {
        for (Employee e : employees) {
            if (e.getLastName().equals(lastName)) {
                e.setFirstName(updatedEmployee.getFirstName());
                e.setAge(updatedEmployee.getAge());
                e.setPosition(updatedEmployee.getPosition());
                saveEmployees();
                break;
            }
        }
    }

    public Employee findEmployeeByLastName(String lastName) {
        return employees.stream()
                .filter(e -> e.getLastName().equals(lastName))
                .findFirst()
                .orElse(null);
    }

    public List<Employee> findEmployeesByAge(int age) {
        return employees.stream()
                .filter(e -> e.getAge() == age)
                .collect(Collectors.toList());
    }

    public List<Employee> findEmployeesByFirstLetter(char letter) {
        return employees.stream()
                .filter(e -> e.getLastName().charAt(0) == letter)
                .collect(Collectors.toList());
    }

    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("Немає співробітників.");
        } else {
            employees.forEach(System.out::println);
        }
    }

    public void displayEmployees(List<Employee> employeesToDisplay) {
        if (employeesToDisplay.isEmpty()) {
            System.out.println("Не знайдено співробітників.");
        } else {
            employeesToDisplay.forEach(System.out::println);
        }
    }
}
