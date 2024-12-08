package main.java.com.example.service;

import main.java.com.example.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CsvProcessorTest {

    private CsvProcessor csvProcessor;

    @BeforeEach
    public void setup() {
        csvProcessor = new CsvProcessor();
    }

    @Test
    public void testProcessProducts() {
        Product product1 = new Product("АТБ", "Гречка", 30.25, 120);
        Product product2 = new Product("Сильпо", "Сахар", 22.20, 107);
        List<Product> products = List.of(product1, product2);

        var processed = csvProcessor.processProducts(products);

        assertNotNull(processed);
        assertEquals(2, processed.size());
        assertTrue(processed.containsKey("АТБ"));
        assertTrue(processed.containsKey("Сильпо"));
    }

    @Test
    public void testMergeProducts() {
        Product product1 = new Product("АТБ", "Гречка", 30.25, 120);
        Product product2 = new Product("АТБ", "Гречка", 31.25, 100);
        List<Product> products = List.of(product1, product2);

        var merged = csvProcessor.mergeProducts(products);

        assertEquals(1, merged.size());
        assertEquals(220, merged.get(0).getQuantity());
        assertEquals(30.75, merged.get(0).getPrice(), 0.01);
    }
}
