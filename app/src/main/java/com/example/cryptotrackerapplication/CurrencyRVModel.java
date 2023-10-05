package com.example.cryptotrackerapplication;

public class CurrencyRVModel {
    private String name;
    private String Symbol;
    private double price;

    public CurrencyRVModel(String name, String symbol, double price) {
        this.name = name;
        Symbol = symbol;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String symbol) {
        Symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


