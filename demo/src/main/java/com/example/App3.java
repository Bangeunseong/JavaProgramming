package com.example;

import javafx.application.Application;
import javafx.stage.Stage;

public class App3 extends Application {
    //Constructor
    public App3(){System.out.println(Thread.currentThread().getName() + ": App3");}

    //Method
    @Override
    public void init() throws Exception {
        System.out.println(Thread.currentThread().getName() + ": init()");
    }
    @Override
    public void start(Stage stage) throws Exception {
        System.out.println(Thread.currentThread().getName() + ": start()");
        stage.show();
    }
    @Override
    public void stop() throws Exception {
        System.out.println(Thread.currentThread().getName() + ": stop()");
    }

    //Main
    public static void main(String[] args){
        launch(args);
    }
}
