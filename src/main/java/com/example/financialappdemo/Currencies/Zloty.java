package com.example.financialappdemo.Currencies;

import java.util.HashMap;

public class Zloty {

    public HashMap<String, Double> pln() {
        HashMap<String, Double> PLN = new HashMap<>();
        PLN.put("PLN-USD", 0.255);
        PLN.put("PLN-EUR", 0.2187);
        PLN.put("PLN-GBP", 0.1849);
        return PLN;
    }
}
