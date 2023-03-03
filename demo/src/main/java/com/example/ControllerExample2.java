package com.example;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;

public class ControllerExample2 implements Initializable {
    @FXML private Label label;
    @FXML private Slider slider;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                label.setFont(new Font(newValue.doubleValue()));
            }
        });
    }
}
