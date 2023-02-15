package com.example.javaprogram2;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App_shadowstyle extends Application {
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException{
        Parent root = (Parent)FXMLLoader.load(getClass().getResource("CSS/shadowstyle.fxml"));
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("CSS/app_shadowstyle.css").toString());

        stage.setTitle("ShadowStyle");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}
