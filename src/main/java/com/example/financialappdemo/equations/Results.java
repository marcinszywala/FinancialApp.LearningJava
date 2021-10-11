package com.example.financialappdemo.equations;

public class Results {

    public double mathOperations(String expression) {

        String[] operators = expression.split("[0-9]+");
        String[] operands = expression.split("[+\\-,*/]");
        double results = Integer.parseInt(operands[0]);
        for(int i=1;i<operands.length;i++){
            switch (operators[i]) {
                case "/" -> results /= Integer.parseInt(operands[i]);
                case "*" -> results *= Integer.parseInt(operands[i]);
                case "-" -> results -= Integer.parseInt(operands[i]);
                case "+" -> results += Integer.parseInt(operands[i]);
            }
        }


        return results;
    }
    }
