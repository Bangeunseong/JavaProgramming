package com.example.javaprogram2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.Observable;
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

public class example7Controller implements Initializable {
    @FXML private ListView<String> listView;
    @FXML private TableView<Phone> tableView;
    @FXML private ImageView imageView;

    @Override
    public void initialize(URL location, ResourceBundle resources){
        listView.setItems(FXCollections.observableArrayList(
            "GalaxyS1","GalaxyS2","GalaxyS3","GalaxyS4","GalaxyS5","GalaxyS6","GalaxyS7"
        ));

        listView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue){
                tableView.getSelectionModel().select(newValue.intValue());
                tableView.scrollTo(newValue.intValue());
            }
        });

        ObservableList<Phone> phoneList = FXCollections.observableArrayList(
            new Phone("GalaxyS1", "phone1.png"),
            new Phone("GalaxyS2", "phone2.png"),
            new Phone("GalaxyS3", "phone3.png"),
            new Phone("GalaxyS4", "phone4.png"),
            new Phone("GalaxyS5", "phone5.png"),
            new Phone("GalaxyS6", "phone6.png"),
            new Phone("GalaxyS7", "phone7.png")
        );

        TableColumn<? extends Phone, ?> tcSmartPhone = tableView.getColumns().get(0);
        tcSmartPhone.setCellValueFactory(new PropertyValueFactory<>("smartPhone"));
        tcSmartPhone.setStyle("-fx-alignment: CENTER;");

        TableColumn<? extends Phone, ?> tcImage = tableView.getColumns().get(1);
        tcImage.setCellValueFactory(new PropertyValueFactory<>("image"));
        tcImage.setStyle("-fx-alignment: CENTER;");

        tableView.setItems(phoneList);

        tableView.getSelectionModel().selectedItemProperty().addListener(
            new ChangeListener<Phone>() {
                @Override
                public void changed(ObservableValue<? extends Phone> observable, Phone oldValue, Phone newValue){
                    if(newValue!=null){
                        listView.getSelectionModel().select(newValue.getSmartPhone());
                        listView.scrollTo(newValue.getSmartPhone());
                        imageView.setImage(new Image(getClass().getResource("images/" + newValue.getImage()).toString()));
                    }
                }
            }
        );
    }

    public void handleBtnOkAction(ActionEvent e){
            String item = listView.getSelectionModel().getSelectedItem();
            System.out.println("ListView smartphone: " + item);

            Phone phone = tableView.getSelectionModel().getSelectedItem();
            System.out.println("TableView smartphone: " + phone.getSmartPhone());
            System.out.println("TableView image: " + phone.getImage());
    }

    public void handleBtnCancelAction(ActionEvent e){Platform.exit();}
}
