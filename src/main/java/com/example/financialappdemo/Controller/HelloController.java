package com.example.financialappdemo.Controller;


import com.example.financialappdemo.equations.Results;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class HelloController {

    Results results = new Results();

    @FXML
    private Label expression;

    @FXML
    private Label result;

    public void setResult(String newResult) {
        this.result.setText((newResult));
    }

    public void insertNumber(String number) {
        expression.setText(expression.getText() + number);
    }

    public void insertOperator(String operator) {
      if (isFirstCharIsMinus(expression.getText(), operator)){
          expression.setText(expression.getText() + "" + operator + "");
      }
      else if (!isLastCharOperator(expression.getText())) {
            expression.setText(expression.getText() + "" + operator + "");
        }

    }

    public boolean isFirstCharIsMinus(String expression, String operator) {
        return expression.length() == 0 && operator.equals("-");
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

}

/*TODO
- ŻEBY DZIAŁAŁO                                                                         PRAWIE DZIALA !!
- pierwszy znak przed pierwszą w kalkulatorze to może być tylko i wyłącznie minus   DO ZROBIENIA
- zablokować możliwość wklepania kilku znaków obok siebie                                   DONE


 */