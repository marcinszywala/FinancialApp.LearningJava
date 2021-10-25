package com.example.financialappdemo.Currencies;

import java.util.HashMap;

public class Pound {

    public HashMap<String, Double> gbp() {
        HashMap<String, Double> GBP = new HashMap<>();
        GBP.put("GBP-USD", 1.3793);
        GBP.put("GBP-EUR", 1.183);
        GBP.put("GBP-PLN", 5.4084);
        return GBP;
    }
}
