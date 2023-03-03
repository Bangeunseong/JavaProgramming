package com.example;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControllerExample6 implements Initializable {
    @FXML private TextField textTitle;
    @FXML private PasswordField textPassword;
    @FXML private ComboBox<String> comboPublic;
    @FXML private DatePicker dateExit;
    @FXML private TextArea textContent;

    @Override
    public void initialize(URL location, ResourceBundle resourceBundle) {
        
    }

    public void handleBtnRegAction(ActionEvent e){
        String title = textTitle.getText();
        System.out.println("Title: " + title);
        String password = textPassword.getText();
        System.out.println("Password: " + password);
        String strPublic = comboPublic.getValue();
        System.out.println("Public: " + strPublic);
        LocalDate localDate = dateExit.getValue();
        if(localDate != null){System.out.println("Deadline: " + localDate.toString());}
        String content = textContent.getText();
        System.out.println("Content: " + content);
    }

    public void handleBtnCancelAction(ActionEvent e){Platform.exit();}
    
}
