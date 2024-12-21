package com.javaondemand.examples.controller;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TreeViewExample extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {



        StackPane root = new StackPane();
        primaryStage.setScene(new Scene(root, 250, 250));
        primaryStage.setTitle("JavaFX");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

