package com.example.financialappdemo.Currencies;

import java.util.HashMap;

public class Dollar {

    public HashMap<String, Double> usd() {
        HashMap<String, Double> USD = new HashMap<>();
        USD.put("USD-EUR", 0.8577);
        USD.put("USD-GBP", 0.725);
        USD.put("USD-PLN", 3.9212);
        return USD;
    }
}
