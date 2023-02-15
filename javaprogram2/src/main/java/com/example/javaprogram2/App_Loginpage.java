package com.example.javaprogram2;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App_Loginpage extends Application {
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException{
        Parent root = (Parent)FXMLLoader.load(getClass().getResource("LoginFormat/login.fxml"));
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("LoginFormat/Login_style.css").toString());

        stage.setTitle("LoginPage");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}
