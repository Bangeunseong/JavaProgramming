package com.example;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;


public class ControllerExample3 implements Initializable {
    @FXML private TextArea textArea1;
    @FXML private TextArea textArea2;
    
    @Override
    public void initialize(URL location, ResourceBundle resourceBundle) {
        Bindings.bindBidirectional(textArea1.textProperty(), textArea2.textProperty());
    }
    
}
