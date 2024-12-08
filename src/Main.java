package main.java.com.example;

import main.java.com.example.model.Product;
import main.java.com.example.service.CsvReader;
import main.java.com.example.service.CsvProcessor;
import main.java.com.example.service.CsvWriter;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        CsvReader csvReader = new CsvReader();
        CsvProcessor csvProcessor = new CsvProcessor();
        CsvWriter csvWriter = new CsvWriter();

        // Зчитуємо два CSV файли
        List<Product> products1 = csvReader.readCsv("order_1.csv");
        List<Product> products2 = csvReader.readCsv("order_2.csv");

        // Обробка товарів
        List<Product> allProducts = List.of(products1, products2)
                .stream()
                .flatMap(List::stream)
                .toList();
        Map<String, List<Product>> processedProducts = csvProcessor.processProducts(allProducts);

        // Мержимо товари і пишемо в нові файли
        for (Map.Entry<String, List<Product>> entry : processedProducts.entrySet()) {
            List<Product> mergedProducts = csvProcessor.mergeProducts(entry.getValue());
            csvWriter.writeCsv(mergedProducts, entry.getKey() + "_res.csv");
        }
    }
}
