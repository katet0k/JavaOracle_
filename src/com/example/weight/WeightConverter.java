package com.example.weight;

public class WeightConverter {

    public double toMilligrams(double value, String unit) {
        switch (unit) {
            case "g":
                return value * 1000;
            case "kg":
                return value * 1000000;
            case "q":
                return value * 100000;
            case "t":
                return value * 1000000000;
            default:
                return value;
        }
    }
}
