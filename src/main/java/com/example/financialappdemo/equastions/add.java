package com.example.financialappdemo.equastions;

import com.example.financialappdemo.Controller.HelloController;

public class add {

    private void add() {

        String calculation = String.valueOf(HelloController.getIsEqual());
        String[] parts = calculation.split("\\+");

        int result = 0;
        if (parts[0].equals(" ")) {
            result = 0;
        }


        for (int i = 1; i < parts.length; i++) {
            result += Integer.parseInt(parts[i]);

            String.valueOf(HelloController.setIsEqual(result));
        }
    }
}
