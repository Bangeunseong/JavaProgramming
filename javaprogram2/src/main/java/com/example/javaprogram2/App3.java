package com.example.javaprogram2;

import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App3 extends Application {
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException{
        //-----------Padding setting-----------
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(50,10,10,50));

        Button button = new Button();
        button.setPrefSize(100, 100);

        //-----------Margin setting-----------
        /*HBox hbox = new HBox();
        Button button = new Button();
        button.setPrefSize(100, 100);
        hbox.setMargin(button, new Insets(50,10,10,50));*/

        hbox.getChildren().add(button);

        scene = new Scene(hbox);

        stage.setTitle("AppMain3");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
