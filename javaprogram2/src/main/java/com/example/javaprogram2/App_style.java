package com.example.javaprogram2;

import java.io.IOException;

import javafx.scene.Parent;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App_style extends Application {
    @Override
    public void start(Stage stage) throws IOException{
        Parent root = (Parent)FXMLLoader.load(getClass().getResource("CSS/fieldstyle.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("CSS/app_fieldstyle.css").toString());

        stage.setTitle("Style");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}
