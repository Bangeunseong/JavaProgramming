package com.example;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App5_UsingGraphic extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(10));
        hbox.setSpacing(10);

        TextField textField = new TextField();
        textField.setPrefWidth(200);

        Button button = new Button();
        button.setText("OK");
        button.setOnAction(event->Platform.exit());

        ObservableList<Node> list = hbox.getChildren();
        list.add(textField);
        list.add(button);

        Scene scene = new Scene(hbox);

        stage.setTitle("AppMain");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args){
        launch();
    }
}
