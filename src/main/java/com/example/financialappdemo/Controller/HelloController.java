package com.example.financialappdemo.Controller;


import com.example.financialappdemo.equastions.Results;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class HelloController {

    Results results = new Results();
    public Label getExpression() {
        return expression;
    }

    public void setExpression(Label newExpression) {
        this.expression.setText(String.valueOf(newExpression));
    }

    @FXML
    private  Label expression;

    @FXML
    private Label result;

    public void setResult(String newResult) {
        this.result.setText(String.valueOf(newResult));
    }

    public void insertNumber(String number){
        expression.setText(expression.getText() + number);
    }

    public void insertOperator(String operator) {
        if (!isLastCharOperator(expression.getText())) {
            expression.setText(expression.getText() + "" + operator + "");
        }
    }
    private boolean isLastCharOperator(String expression){
        if(expression.length() == 0){
            return false;
        }
        char last = expression.charAt(expression.length() -1);
        if (last == '+' || last == '-' || last == '*' || last == '/'){
            return true;

        }

        return false;
    }
    public void clear(){
        expression.setText("");
        result.setText("");
    }

    public void delete(){
        StringBuilder sb = new StringBuilder((CharSequence) expression.getText());
        sb.deleteCharAt(sb.length()-1);
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
            case "=" -> getResults();


        }
    }

    private void getResults() {

        double result = results.minus(this.getExpression().getText());
        setResult(String.valueOf(result));

    }
}

/*TODO
- ŻEBY DZIAŁAŁO
- pierwszy znak przed pierwszą w kalkulatorze to może być tylko i wyłącznie minus
- zablokować możliwość wklepania kilku znaków obok siebie                                   DONE


 */