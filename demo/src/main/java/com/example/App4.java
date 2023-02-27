package com.example;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class App4 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        root.setPrefHeight(150);
        root.setPrefWidth(350);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);

        Label label = new Label();
        label.setText("Hello, JavaFX");
        label.setFont(new Font(50));

        Button button = new Button();
        button.setText("OK");
        button.setOnAction(event->Platform.exit());

        root.getChildren().addAll(label, button);

        Scene scene = new Scene(root);
        stage.setTitle("AppMain");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args){
        launch();
    }
}
