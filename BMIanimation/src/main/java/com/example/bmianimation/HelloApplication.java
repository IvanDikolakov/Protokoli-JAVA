package com.example.bmianimation;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {

        Button submit = new Button("Submit");
        GridPane root = new GridPane();
        Image image = new Image("https://gastrogynae.com/wp-content/uploads/2021/12/man-body-mass-index-vector.jpg");
        BackgroundImage backgroundImage = new BackgroundImage (
                image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                BackgroundSize.DEFAULT
        );

        Background background = new Background(backgroundImage);
        root.setBackground(background);

        final double KG_PER_POUNDS = 0.45359237;
        final double METER_PER_INCH = 0.0254;

        Label heightLabel = new Label("Height");
        Label weightLabel = new Label("Weight");
        Label bmiLabel = new Label();

        TextField heightTextField = new TextField();
        TextField weightTextField = new TextField();

        submit.setOnAction(e -> {
            double heightMeters = Integer.parseInt(heightTextField.getText()) * METER_PER_INCH;
            double weightKg = Integer.parseInt(weightTextField.getText()) * KG_PER_POUNDS;
            double bmiCalculated = weightKg / (heightMeters * heightMeters);
            //sets label
            bmiLabel.setText("Your BMI is " + bmiCalculated + ".\n");
        });
        root.addRow(0, heightLabel, heightTextField);
        root.addRow(1, weightLabel, weightTextField);
        root.addRow(2, bmiLabel);
        root.addRow(3, submit);

        Scene scene = new Scene(root, 600, 500);
        stage.setTitle("BMI");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}