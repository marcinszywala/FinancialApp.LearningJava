package com.example.financialappdemo.Controller;


import com.example.financialappdemo.equastions.add;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class HelloController {


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

    public void insertOperator(String operator){
        expression.setText(expression.getText() + "" + operator + "");
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
            case "=" -> {
                double result = add.add(this.getExpression().getText());
                setResult(String.valueOf(result));
            }
        }
    }
}
