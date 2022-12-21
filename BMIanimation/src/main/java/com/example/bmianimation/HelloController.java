package com.example.bmianimation;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField height = new TextField();
    @FXML
    private TextField weight = new TextField();
    @FXML
    private Label bmi = new Label();


    @FXML
    protected void onSubmitButtonClick() { bmi.setText("Your BMI is: "+ bmi);
    }
}