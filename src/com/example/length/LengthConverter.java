package com.example.length;

public class LengthConverter {

    public double toMillimeters(double value, String unit) {
        switch (unit) {
            case "cm":
                return value * 10;
            case "dm":
                return value * 100;
            case "m":
                return value * 1000;
            case "km":
                return value * 1000000;
            default:
                return value;
        }
    }
}

