package main.java.com.example.service;

import main.java.com.example.model.Product;
import main.java.com.example.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    public List<Product> readCsv(String filePath) throws IOException {
        List<Product> products = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] nextLine;
            // Пропускаємо перший рядок (заголовки)
            reader.readNext();

            while ((nextLine = reader.readNext()) != null) {
                String storeName = nextLine[0].trim();
                String productName = nextLine[1].trim();
                double price = Double.parseDouble(nextLine[2].trim());
                int quantity = Integer.parseInt(nextLine[3].trim());

                products.add(new Product(storeName, productName, price, quantity));
            }
        }
        return products;
    }
}
