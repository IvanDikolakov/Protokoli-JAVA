package com.example.calculatorapplication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorController implements Initializable {
    @FXML
    private TextField firstNumber;
    @FXML
    private TextField secondNumber;
    @FXML
    private TextField result;

    @FXML
    private void onAddButtonClick(ActionEvent event) {
        result.setText(getResult('+') + "");
    }
    @FXML
    private void onSubtractButtonClick(ActionEvent event) {
        result.setText(getResult('-') + "");
    }
    @FXML
    private void onMultiplyButtonClick(ActionEvent event) {
        result.setText(getResult('*') + "");
    }
    @FXML
    private void onDivideButtonClick(ActionEvent event) {
        result.setText(getResult('/') + "");
    }

    private double getResult(char operation) {
        double value1 = Double.parseDouble(firstNumber.getText());
        double value2 = Double.parseDouble(secondNumber.getText());
        return switch (operation) {
            case '+' -> value1 + value2;
            case '-' -> value1 - value2;
            case '*' -> value1 * value2;
            case '/' -> value1 / value2;
            default -> Double.NaN;
        };
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}
