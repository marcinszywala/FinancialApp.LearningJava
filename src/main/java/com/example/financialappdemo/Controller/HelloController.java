package com.example.financialappdemo.Controller;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    private Label isequal = new Label();

    public void insertNumber(String number){
        isequal.setText(isequal.getText() + number);
    }

    public void insertOperator(String operator){
        isequal.setText(isequal.getText() + "" + operator + "");
    }

    public void clear(){
        isequal.setText("");
    }

    public void delete(){
        StringBuffer sb = new StringBuffer((CharSequence) isequal.getText());
        sb.deleteCharAt(sb.length()-1);
        isequal.setText(String.valueOf(sb));

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
