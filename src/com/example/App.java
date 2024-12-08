package com.example;
import com.example.geometry.*;
import com.example.currency.CurrencyConverter;
import com.example.strings.StringUtils;
import com.example.length.LengthConverter;
import com.example.weight.WeightConverter;

public class App {

    public static void main(String[] args) {
        // Задача 1: Обчислення площ геометричних фігур
        System.out.println("=== Задача 1: Площі геометричних фігур ===");
        
        // Треугольник
        Triangle triangle = new Triangle(5, 10);
        System.out.println("Площа треугольника: " + triangle.calculateArea());

        // Прямокутник
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Площа прямокутника: " + rectangle.calculateArea());

        // Квадрат
        Square square = new Square(5);
        System.out.println("Площа квадрата: " + square.calculateArea());

        // Ромб
        Rhombus rhombus = new Rhombus(5, 8);
        System.out.println("Площа ромба: " + rhombus.calculateArea());

        // Задача 2: Конвертація валют
        System.out.println("\n=== Задача 2: Конвертація валют ===");
        double amount = 100; // сума для конвертації
        System.out.println(amount + " USD = " + CurrencyConverter.convertToEuro(amount) + " EUR");
        System.out.println(amount + " USD = " + CurrencyConverter.convertToPound(amount) + " GBP");

        // Задача 3: Робота зі строками
        System.out.println("\n=== Задача 3: Строки ===");
        String palindromeTest = "madam";
        System.out.println(palindromeTest + " є паліндром? " + StringUtils.isPalindrome(palindromeTest));
        System.out.println("Кількість голосних у '" + palindromeTest + "': " + StringUtils.countVowels(palindromeTest));

        // Задача 4: Переведення одиниць вимірювання довжини
        System.out.println("\n=== Задача 4: Переведення довжини ===");
        double meters = 1000;
        System.out.println(meters + " м = " + LengthConverter.metersToKilometers(meters) + " км");
        System.out.println(meters + " м = " + LengthConverter.metersToCentimeters(meters) + " см");

        // Задача 5: Переведення одиниць вимірювання ваги
        System.out.println("\n=== Задача 5: Переведення ваги ===");
        double kilograms = 75;
        System.out.println(kilograms + " кг = " + WeightConverter.kgToGrams(kilograms) + " г");
        System.out.println(kilograms + " кг = " + WeightConverter.kgToTons(kilograms) + " т");
    }
}
