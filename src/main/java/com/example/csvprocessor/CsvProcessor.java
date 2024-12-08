package main.java.com.example.csvprocessor;


import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import lombok.SneakyThrows;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
import java.util.stream.Collectors;

public class CsvProcessor {

    // Метод обробки CSV файлів
    @SneakyThrows
    public void processCsvFiles(String file1, String file2, String outputFile) {
        List<Product> products = new ArrayList<>();

        // Читання першого CSV файлу
        readCsv(file1, products);
        // Читання другого CSV файлу
        readCsv(file2, products);

        // Групування товарів по магазинах
        Map<String, List<Product>> storeGroups = products.stream()
                .collect(Collectors.groupingBy(Product::getStoreName));

        // Обробка даних для кожного магазину
        for (Map.Entry<String, List<Product>> entry : storeGroups.entrySet()) {
            List<Product> storeProducts = entry.getValue();
            Map<String, Product> mergedProducts = new HashMap<>();

            // Об'єднання однотипних товарів в одному магазині
            for (Product product : storeProducts) {
                String key = product.getProductName();
                if (mergedProducts.containsKey(key)) {
                    Product existingProduct = mergedProducts.get(key);
                    int newQuantity = existingProduct.getQuantity() + product.getQuantity();
                    double newPrice = (existingProduct.getPrice() * existingProduct.getQuantity() + product.getPrice() * product.getQuantity()) / newQuantity;
                    mergedProducts.put(key, new Product(product.getStoreName(), key, newPrice, newQuantity));
                } else {
                    mergedProducts.put(key, product);
                }
            }

            // Запис результату в новий CSV файл
            writeCsv(outputFile.replace("store", entry.getKey()), new ArrayList<>(mergedProducts.values()));
        }
    }

    // Метод для читання CSV файлів
    @SneakyThrows
    private void readCsv(String fileName, List<Product> products) {
        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            String[] nextLine;
            reader.readNext(); // Пропускаємо заголовки
            while ((nextLine = reader.readNext()) != null) {
                String storeName = nextLine[0];
                String productName = nextLine[1];
                double price = Double.parseDouble(nextLine[2]);
                int quantity = Integer.parseInt(nextLine[3]);
                products.add(new Product(storeName, productName, price, quantity));
            }
        }
    }

    // Метод для запису результату в CSV
    @SneakyThrows
    private void writeCsv(String fileName, List<Product> products) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(fileName))) {
            writer.writeNext(new String[]{"Store", "Product", "Price", "Quantity"});
            for (Product product : products) {
                writer.writeNext(new String[]{product.getStoreName(), product.getProductName(), String.valueOf(product.getPrice()), String.valueOf(product.getQuantity())});
            }
        }
    }
}

