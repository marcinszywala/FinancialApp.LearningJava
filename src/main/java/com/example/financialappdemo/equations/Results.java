package com.example.financialappdemo.equations;

import java.util.List;

public class Results {

    public double mathOperations(String expression) {

        List<String> operators = List.of(expression.split("[0-9]+"));
        List<String> operands = List.of(expression.split("[+\\-*/]"));
        double results = 0.0;
        if (isParsable(operands.get(0))){
            results = Integer.parseInt(operands.get(0));
        }
        for (int i = 0; i < operators.size(); i++) {
            double operand = 0.0;
            if (isParsable(operands.get(i))){
                operand = Integer.parseInt(operands.get(i));
            }
            switch (operators.get(i)) {
                case "/" -> results /= operand;
                case "*" -> results *= operand;
                case "+" -> results += operand;
                case "-" -> results -= operand;
            }

        }
        return results;
    }

    public boolean isParsable ( String input){
        try{
            Integer.parseInt(input);
            return true;
        } catch (final NumberFormatException e ) {
            return false;
        }
    }
}
