package main.java.com.example.model;

import lombok.Data;

@Data
public class Product {
    private String storeName;
    private String productName;
    private double price;
    private int quantity;

    public Product(String storeName, String productName, double price, int quantity) {
        this.storeName = storeName;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
}
