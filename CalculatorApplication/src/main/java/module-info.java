module com.example.calculatorapplication {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.calculatorapplication to javafx.fxml;
    exports com.example.calculatorapplication;
}