package test.java.com.example.csvprocessor;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CsvProcessorTest {

    @Test
    void testCsvProcessing() {
        CsvProcessor processor = new CsvProcessor();
        processor.processCsvFiles("order_1.csv", "order_2.csv", "store_res.csv");

        // Тест: Перевірка створення файлів або їх вмісту
        // Наприклад, можна додати валідацію для вмісту файлів або перевірити існування файлів
        File file = new File("store_res.csv");
        assertTrue(file.exists());
    }
}

