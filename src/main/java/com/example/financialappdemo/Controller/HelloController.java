package com.example.financialappdemo.Controller;


import com.example.financialappdemo.Currencies.CurrencyCalc;
import com.example.financialappdemo.equations.Results;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    private TextField calcFrom;
    @FXML
    private TextField calcTo;
    @FXML
    private Label pickedFrom;
    @FXML
    private Label pickedTo;
    @FXML
    private Label expression;
    @FXML
    private Label result;

    CurrencyCalc calc = new CurrencyCalc();

    Results results = new Results();


    public void setResult(String newResult) {
        this.result.setText((newResult));
    }

    public void insertNumber(String number) {
        expression.setText(expression.getText() + number);
    }

    public void insertOperator(String operator) {
      if (!isLastCharOperator(expression.getText())) {
            expression.setText(expression.getText() + "" + operator + "");
        }

    }

    public String mergeString(String pickedFrom, String pickedTo){
        return pickedFrom + "-" + pickedTo;
    }
    private boolean isLastCharOperator(String expression) {
        if (expression.length() == 0) {
            return true;
        }
        char last = expression.charAt(expression.length() - 1);
        return last == '+' || last == '-' || last == '*' || last == '/';
    }

    public void clear() {
        expression.setText("");
        result.setText("");
    }

    public void delete() {
        StringBuilder sb = new StringBuilder((CharSequence) expression.getText());
        sb.deleteCharAt(sb.length() - 1);
        expression.setText(String.valueOf(sb));

    }

    public void OnMouseClick(MouseEvent mouseEvent) {

        Button button = (Button) mouseEvent.getSource();
        String buttonText = button.getText();


        switch (buttonText) {
            case "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" -> insertNumber(buttonText);
            case "+", "-", "*", "/" -> insertOperator(buttonText);
            case "C" -> clear();
            case "Delete" -> delete();
            case "=" -> {
              double result = results.mathOperations(String.valueOf(expression.getText()));
                setResult(String.valueOf(result));
            }
        }
    }

    public void OnMouse(MouseEvent mouseEvent){

        Button calculate = (Button) mouseEvent.getSource();
        String buttonText2 = calculate.getText();

        if ("Calculate".equals(buttonText2)) {
            calcTo.setText(String.valueOf(giveResult(Double.parseDouble(calcFrom.getText()))));
        }


    }

    private double giveResult(double calcFrom) {
        double result = calc.currencyOperations(mergeString(String.valueOf(pickedFrom.getText()), String.valueOf(pickedTo.getText())));
        result = result * calcFrom;
        result = (double)Math.round(result * 100000d) / 100000d;
        return result;
    }

    public void PLN() {
        if(pickedTo.getText().equals("PLN"))
            pickedFrom.setText("ERROR");
        else
            pickedFrom.setText("PLN");
    }

    public void GBP() {
        if(pickedTo.getText().equals("GBP"))
            pickedFrom.setText("ERROR");
        else
            pickedFrom.setText("GBP");

    }

    public void EUR() {
        if(pickedTo.getText().equals("EUR"))
            pickedFrom.setText("ERROR");
        else
            pickedFrom.setText("EUR");

    }

    public void USD() {
        if(pickedTo.getText().equals("USD"))
            pickedFrom.setText("ERROR");
        else
            pickedFrom.setText("USD");

    }

    public void PLN2() {
        if(pickedFrom.getText().equals("PLN"))
            pickedTo.setText("ERROR");
        else
            pickedTo.setText("PLN");
    }

    public void GBP2() {
        if(pickedFrom.getText().equals("GBP"))
            pickedTo.setText("ERROR");
        else
            pickedTo.setText("GBP");
    }

    public void EUR2() {
        if(pickedFrom.getText().equals("EUR"))
            pickedTo.setText("ERROR");
        else
            pickedTo.setText("EUR");
    }

    public void USD2() {
        if(pickedFrom.getText().equals("USD"))
            pickedTo.setText("ERROR");
        else
            pickedTo.setText("USD");
    }
}
