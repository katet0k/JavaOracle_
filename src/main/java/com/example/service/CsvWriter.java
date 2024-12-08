package main.java.com.example.service;

import main.java.com.example.model.Product;
import main.java.com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvWriter {

    public void writeCsv(List<Product> products, String filePath) throws IOException {
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            // Записуємо заголовки
            writer.writeNext(new String[] {"ИМЯ", "НАИМЕНОВАНИЕ", "ЦЕНА", "ШТ"});

            // Записуємо продукти
            for (Product product : products) {
                writer.writeNext(new String[]{
                        product.getStoreName(),
                        product.getProductName(),
                        String.valueOf(product.getPrice()),
                        String.valueOf(product.getQuantity())
                });
            }
        }
    }
}
