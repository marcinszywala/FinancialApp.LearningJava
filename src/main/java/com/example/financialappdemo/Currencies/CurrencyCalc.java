package com.example.financialappdemo.Currencies;

public class CurrencyCalc {

    Euro Euro = new Euro();
    Pound Pound = new Pound();
    Zloty Zloty = new Zloty();
    Dollar Dollar = new Dollar();


    public double currencyOperations(String currency) {
        double value;
            if(Euro.eur().containsKey(currency))
                value = Euro.eur().get(currency);

            else if(Pound.gbp().containsKey(currency))
                value = Pound.gbp().get(currency);

            else if (Zloty.pln().containsKey(currency))
                value = Zloty.pln().get(currency);

            else
                value = Dollar.usd().get(currency);


        return value;
    }

}
