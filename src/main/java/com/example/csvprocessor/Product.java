package main.java.com.example.csvprocessor;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String storeName;      // Назва магазину
    private String productName;    // Назва товару
    private double price;          // Ціна товару
    private int quantity;          // Кількість товару
}

