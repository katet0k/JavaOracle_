package com.example;

import com.example.geometry.*;
import com.example.currency.CurrencyConverter;
import com.example.strings.StringUtils;
import com.example.length.LengthConverter;
import com.example.weight.WeightConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    // Тестування геометричних фігур
    @Test
    void testTriangleArea() {
        Triangle triangle = new Triangle(3, 4);
        assertEquals(6, triangle.calculateArea(), "Площа трикутника повинна бути 6");
    }

    @Test
    void testRectangleArea() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(50, rectangle.calculateArea(), "Площа прямокутника повинна бути 50");
    }

    @Test
    void testSquareArea() {
        Square square = new Square(4);
        assertEquals(16, square.calculateArea(), "Площа квадрата повинна бути 16");
    }

    @Test
    void testRhombusArea() {
        Rhombus rhombus = new Rhombus(5, 8);
        assertEquals(40, rhombus.calculateArea(), "Площа ромба повинна бути 40");
    }

    // Тестування конвертації валют
    @Test
    void testCurrencyConverterUSDToEUR() {
        double amountInUSD = 100;
        double convertedAmount = CurrencyConverter.convert(amountInUSD, "USD", "EUR");
        assertTrue(convertedAmount > 0, "Конвертація з USD в EUR повинна бути успішною");
    }

    @Test
    void testCurrencyConverterEURToGBP() {
        double amountInEUR = 100;
        double convertedAmount = CurrencyConverter.convert(amountInEUR, "EUR", "GBP");
        assertTrue(convertedAmount > 0, "Конвертація з EUR в GBP повинна бути успішною");
    }

    // Тестування роботи зі строками
    @Test
    void testPalindrome() {
        assertTrue(StringUtils.isPalindrome("racecar"), "racecar повинно бути паліндромом");
        assertFalse(StringUtils.isPalindrome("hello"), "hello не є паліндромом");
    }

    @Test
    void testVowelCount() {
        String testString = "hello";
        assertEquals(2, StringUtils.countVowels(testString), "У рядку 'hello' повинно бути 2 голосні");
    }

    @Test
    void testConsonantCount() {
        String testString = "hello";
        assertEquals(3, StringUtils.countConsonants(testString), "У рядку 'hello' повинно бути 3 приголосні");
    }

    @Test
    void testWordCount() {
        String testString = "hello world hello";
        assertEquals(2, StringUtils.countWordOccurrences(testString, "hello"), "Слово 'hello' повинно зустрічатися 2 рази");
    }

    // Тестування конвертації довжини
    @Test
    void testLengthConversion() {
        double valueInMeters = 100;
        double valueInKilometers = LengthConverter.convert(valueInMeters, "m", "km");
        assertEquals(0.1, valueInKilometers, "100 метрів повинно бути 0.1 кілометра");
    }

    // Тестування конвертації ваги
    @Test
    void testWeightConversion() {
        double valueInGrams = 1000;
        double valueInKilograms = WeightConverter.convert(valueInGrams, "g", "kg");
        assertEquals(1, valueInKilograms, "1000 грам повинно бути 1 кілограмом");
    }

    // Тестування роботи основного класу App
    @Test
    void testAppMainFunctionality() {
        // Перевірка, що метод main не викликає помилок
        try {
            App.main(new String[]{});
        } catch (Exception e) {
            fail("Метод main викликав виключення: " + e.getMessage());
        }
    }
}
