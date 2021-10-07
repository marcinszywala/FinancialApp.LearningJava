package com.example.financialappdemo.equastions;

public class Results {


    public double minus(String expression) {

        boolean check = false;
        if(expression.startsWith("-")) check = true;
        String[] parts = expression.split("\\-");

        int result = 0;
        if (check) {
            result -= Integer.parseInt(parts[1]);
            for (int i = 2; i < parts.length; i++) {
                result -= Integer.parseInt(parts[i]);
            }
        } else {
            result = Integer.parseInt(parts[0]);
            for (int i = 1; i < parts.length; i++) {
                result -= Integer.parseInt(parts[i]);
            }
        }

        check = false;


        return result;
    }


    public double add(String expression) {

        //   String calculation = String.valueOf(new HelloController().getExpression());
        String[] parts = expression.split("\\+");

        int result = 0;

        for (int i = 0; i < parts.length; i++) {
            result += Integer.parseInt(parts[i]);


        }


        return result;
    }

    public double divide(String expression) {

        //  String calculation = String.valueOf(HelloController.getIsEqual());
        String[] parts = expression.split("\\/");

        double result = 0.0;

        result = Integer.parseInt(parts[0]);
        for (int i = 1; i < parts.length; i++) {
            result /= Integer.parseInt(parts[i]);


        }


        return result;
    }

    public double multiply(String expression) {

        //  String calculation = String.valueOf(HelloController.getIsEqual());
        String[] parts = expression.split("\\*");

        int result = Integer.parseInt(parts[0]);



        for (int i = 1; i < parts.length; i++) {
            result *= Integer.parseInt(parts[i]);


        }


        return result;
    }


}

