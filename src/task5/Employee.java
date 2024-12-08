package task5;

import java.io.Serializable;

public class Employee implements Serializable {
    private String lastName;
    private String firstName;
    private int age;
    private String position;

    public Employee(String lastName, String firstName, int age, String position) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.position = position;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return String.format("Прізвище: %s, Ім'я: %s, Вік: %d, Посада: %s", lastName, firstName, age, position);
    }
}
