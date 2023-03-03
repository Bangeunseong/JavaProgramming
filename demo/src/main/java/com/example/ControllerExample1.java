package com.example;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ControllerExample1 implements Initializable {
    @FXML private Button btn1;
    @FXML private Button btn2;
    @FXML private Button btn3;

    @Override
    public void initialize(URL location, ResourceBundle resourceBundle) {
        /*btn1.setOnAction(event->handleBtn1Action(event));
        btn2.setOnAction(event->handleBtn2Action(event));
        btn3.setOnAction(event->handleBtn3Action(event));*/
    }

    public void handleBtn1Action(ActionEvent e){
        System.out.println("Button1 Clicked");
    }

    public void handleBtn2Action(ActionEvent e){
        System.out.println("Button2 Clicked");
    }

    public void handleBtn3Action(ActionEvent e){
        System.out.println("Button3 Clicked");
    }
    
}
