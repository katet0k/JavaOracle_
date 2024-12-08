package main.java.com.example.service;

import main.java.com.example.model.Product;

import java.util.*;
import java.util.stream.Collectors;

public class CsvProcessor {

    public Map<String, List<Product>> processProducts(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getStoreName));
    }

    public List<Product> mergeProducts(List<Product> products) {
        Map<String, Product> productMap = new HashMap<>();

        for (Product product : products) {
            String key = product.getStoreName() + "-" + product.getProductName();

            if (productMap.containsKey(key)) {
                Product existingProduct = productMap.get(key);
                existingProduct.setQuantity(existingProduct.getQuantity() + product.getQuantity());
                existingProduct.setPrice((existingProduct.getPrice() + product.getPrice()) / 2);
            } else {
                productMap.put(key, product);
            }
        }

        return new ArrayList<>(productMap.values());
    }
}
