package com.example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Controller_UsingEventHandler extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        HBox hbox = new HBox();
        hbox.setPrefSize(200, 50);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(20);

        Button btn1 = new Button("Button1");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e){
                System.out.println("Button1 Clicked");
            }
        });

        Button btn2 = new Button("Button2");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.out.println("Button2 Clicked");
            }
        });

        hbox.getChildren().addAll(btn1, btn2);

        Scene scene = new Scene(hbox);
        
        stage.setTitle("AppMain");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args){
        launch(args);
    }
}
