package com.example.javaprogram2;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App_backgroundstyle extends Application {
    @Override
    public void start(Stage stage) throws IOException{
        Parent root = (Parent)FXMLLoader.load(getClass().getResource("CSS/background.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("CSS/app_background.css").toString());

        stage.setTitle("App_backgroundstyle");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}
