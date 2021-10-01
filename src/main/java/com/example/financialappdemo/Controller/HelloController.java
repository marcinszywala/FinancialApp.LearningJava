package com.example.financialappdemo.Controller;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class HelloController {


    public static Label getIsEqual() {
        return isEqual;
    }

    public void setIsEqual(Label isequal) {
        this.isEqual = isequal;
    }

    @FXML
    private Label isEqual = new Label();

    public void insertNumber(String number){
        isEqual.setText(isEqual.getText() + number);
    }

    public void insertOperator(String operator){
        isEqual.setText(isEqual.getText() + "" + operator + "");
    }

    public void clear(){
        isEqual.setText("");
    }

    public void delete(){
        StringBuffer sb = new StringBuffer((CharSequence) isEqual.getText());
        sb.deleteCharAt(sb.length()-1);
        isEqual.setText(String.valueOf(sb));

    }

    public void OnMouseClick(MouseEvent mouseEvent) {

        Button button = (Button) mouseEvent.getSource();
        String buttonText = button.getText();


        switch(buttonText){
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "0":
                insertNumber(buttonText);
                break;
            case "+":
            case "-":
                isEqual.setText("");
            case "*":
            case "/":
                insertOperator(buttonText);
                break;
            case "C":
                clear();
            case "Delete":
                delete();




        }
    }
}
