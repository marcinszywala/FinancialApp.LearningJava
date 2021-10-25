package com.example.financialappdemo.Currencies;

import java.util.HashMap;

public class Euro {

    public HashMap<String, Double> eur() {
        HashMap<String, Double> EUR = new HashMap<>();
        EUR.put("EUR-USD", 1.1659);
        EUR.put("EUR-GBP", 0.8453);
        EUR.put("EUR-PLN", 4.5717);
        return EUR;
    }
}
