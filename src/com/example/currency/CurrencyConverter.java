package com.example.currency;

public class CurrencyConverter {

    public double convertToUSD(double amount, String currency) {
        switch (currency) {
            case "EUR":
                return amount * 1.1;
            case "GBP":
                return amount * 1.3;
            case "JPY":
                return amount * 0.009;
            default:
                return amount;
        }
    }
}

