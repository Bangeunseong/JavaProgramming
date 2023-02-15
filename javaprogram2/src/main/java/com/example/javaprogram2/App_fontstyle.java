package com.example.javaprogram2;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App_fontstyle extends Application {
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException{
        Parent root = (Parent)FXMLLoader.load(getClass().getResource("CSS/fontstyle.fxml"));
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("CSS/app_fontstyle.css").toString());

        stage.setTitle("Fontstyle");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args){
        launch();
    }
}
