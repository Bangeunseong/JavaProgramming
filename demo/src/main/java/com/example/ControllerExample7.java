package com.example;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ControllerExample7 implements Initializable {
    @FXML private ListView<String> listView;
    @FXML private TableView<Phone> tableView;
    @FXML private ImageView imageView;

    @Override
    public void initialize(URL location, ResourceBundle resourceBundle) {
        listView.setItems(FXCollections.observableArrayList(
            "GalaxyS1","GalaxyS2","GalaxyS3","GalaxyS4","GalaxyS5","GalaxyS6","GalaxyS7"
        ));
        listView.getSelectionModel().selectedIndexProperty().addListener(
            new ChangeListener<Number>() {
                @Override
                public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                    tableView.getSelectionModel().select(newValue.intValue());
                    tableView.scrollTo(newValue.intValue());
                }
            }
        );

        ObservableList<Phone> phoneList = FXCollections.observableArrayList(
            new Phone("GalaxyS1", "Test2.png"),
            new Phone("GalaxyS2", "Test2.png"),
            new Phone("GalaxyS3", "Test2.png"),
            new Phone("GalaxyS4", "Test2.png"),
            new Phone("GalaxyS5", "Test2.png"),
            new Phone("GalaxyS6", "Test2.png"),
            new Phone("GalaxyS7", "Test2.png")
        );
        
        TableColumn<Phone,?> tcSmartPhone = tableView.getColumns().get(0);
        tcSmartPhone.setCellValueFactory(new PropertyValueFactory<>("smartPhone"));
        tcSmartPhone.setStyle("-fx-alignment: CENTER;");

        TableColumn<Phone,?> tcImage = tableView.getColumns().get(1);
        tcImage.setCellValueFactory(new PropertyValueFactory<>("image"));
        tcImage.setStyle("-fx-alignment: CENTER;");

        tableView.setItems(phoneList);

        tableView.getSelectionModel().selectedItemProperty().addListener(
            new ChangeListener<Phone>() {
                @Override
                public void changed(ObservableValue<? extends Phone> observable, Phone oldValue, Phone newValue) {
                    if(newValue != null){
                        imageView.setImage(
                            new Image(getClass().getResource("testImages/" + newValue.getImage()).toString())
                        );
                    }
                }
                
            }
        );
    }

    public void handleBtnOkAction(ActionEvent e){
        String item = listView.getSelectionModel().getSelectedItem();
        System.out.println("ListView SmartPhone: " + item);

        Phone phone = tableView.getSelectionModel().getSelectedItem();
        System.out.println("TableView SmartPhone: " + phone.getSmartPhone());
        System.out.println("TableView Image: " + phone.getImage());
    }
    
    public void handleBtnCancelAction(ActionEvent e){Platform.exit();}
}
