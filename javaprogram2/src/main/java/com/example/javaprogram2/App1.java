package com.example.javaprogram2;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App1 extends Application {

    private static Scene scene;

    @Override
    public void init() throws Exception{
        System.out.println(Thread.currentThread().getName() + ": init executed!");
    }

    @Override
    public void start(Stage stage) throws IOException {
        System.out.println(Thread.currentThread().getName() + ": start executed!");
        /*scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();*/

        VBox root = new VBox();
        root.setPrefWidth(350);
        root.setPrefHeight(150);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);

        Label label = new Label();
        label.setText("Hello, JavaFX");
        label.setFont(new Font(50));

        Button button = new Button();
        button.setText("OK");
        button.setOnAction(event->Platform.exit());

        root.getChildren().add(label);
        root.getChildren().add(button);

        scene = new Scene(root);

        stage.setTitle("AppMain1");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception{
        System.out.println(Thread.currentThread().getName() + ": stop executed!");
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App1.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch(args);
    }

}