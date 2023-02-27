package com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App7_Layout extends Application {
    private static Scene scene;

    @Override
    public void start(Stage stage) throws Exception {
        //Set padding
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(50,10,10,50));
        Button button = new Button();
        button.setPrefSize(100, 100);

        //Set Margin
        /*HBox hbox = new HBox();
        Button button = new Button();
        button.setPrefSize(100, 100);
        HBox.setMargin(button, new Insets(10,10,50,50));*/

        hbox.getChildren().add(button);
        scene = new Scene(hbox);

        stage.setTitle("AppMain");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
