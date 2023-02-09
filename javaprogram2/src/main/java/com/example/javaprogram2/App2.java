package com.example.javaprogram2;

import java.io.IOException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App2 extends Application {
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException{
        //Using objects
        /*HBox hbox = new HBox();
        hbox.setPadding(new Insets(10));
        hbox.setSpacing(10);

        TextField textField = new TextField();
        textField.setPrefWidth(200);

        Button button = new Button();
        button.setText("OK");
        button.setOnAction(event->Platform.exit());

        ObservableList list = hbox.getChildren();
        list.add(textField);
        list.add(button);
        
        scene = new Scene(hbox);*/

        //Using fxml
        FXMLLoader fxmlLoader = new FXMLLoader(App2.class.getResource("root.fxml"));
        scene = new Scene(fxmlLoader.load());

        stage.setTitle("AppMain2");
        stage.setScene(scene);
        stage.show();
    }



    public static void main(String[] args){
        launch(args);
    }
}
