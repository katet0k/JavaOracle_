package main.java.com.example.csvprocessor;

public class Main {
    public static void main(String[] args) {
        CsvProcessor processor = new CsvProcessor();
        processor.processCsvFiles("order_1.csv", "order_2.csv", "store_res.csv");
    }
}

