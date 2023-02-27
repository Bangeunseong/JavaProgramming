package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App6_Usingfxml extends Application {
    private static Scene scene;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Basic/root1.fxml"));
        scene = new Scene(root);
        stage.setTitle("AppMain");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args){
        launch();
    }
}
