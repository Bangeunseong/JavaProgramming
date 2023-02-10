package com.example.javaprogram2;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App5 extends Application {
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException{
        HBox root = new HBox();
        root.setPrefSize(200, 50);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);

        Button btn1 = new Button("Button1");
        btn1.setOnAction(
            new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Button1 clicked");
                }
            }
        );

        Button btn2 = new Button("Button2");
        btn2.setOnAction(event->System.out.println("Button2 clicked"));

        root.getChildren().addAll(btn1,btn2);
        scene = new Scene(root);

        stage.setTitle("AppMain5");
        stage.setScene(scene);
        stage.setOnCloseRequest(event->System.out.println("Exit clicked"));
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
