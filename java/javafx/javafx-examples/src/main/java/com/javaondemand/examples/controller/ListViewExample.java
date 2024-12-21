package com.javaondemand.examples.controller;

import com.javaondemand.examples.Person;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableSet;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ListViewExample extends Application {

    public static final ObservableList<String> fakeList = FXCollections.observableArrayList();

    @Override
    public void start(Stage primaryStage) throws Exception {

        List<String> names = List.of(
               "Shakil", "Mark", "Jeckob"
        );

        ObservableList<String> list = FXCollections.observableArrayList(
                names
        );

        ObservableList<String> data = FXCollections.observableArrayList(
                "Eugune", "Remina", "Bully"
        );


        //add fakeList data upto 20
        for (int i = 0; i<= 20; i++){
            fakeList.add("fakeName");
        }

        ListView<String> listView = new ListView<>();
        listView.setEditable(true);
        listView.setPrefWidth(150);
        listView.setPrefHeight(150);

        listView.setItems(fakeList);

        listView.setCellFactory(ComboBoxListCell.forListView(data));



        Group root = new Group(listView);

        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.setTitle("JavaFX");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
