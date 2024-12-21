package com.javaondemand.examples;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        List<Person> persons = List.of(
                new Person("Shakil", "Ahmed"),
                new Person("Mark", "Smith"),
                new Person("Bob", "Smith")
        );

        ObservableList<Person> list = FXCollections.observableArrayList(persons);

        TableView<Person> tableView = new TableView<>();
        tableView.setItems(list);

        TableColumn<Person, String> fName = new TableColumn<>("First Name");
        TableColumn<Person, String> lName = new TableColumn<>("Last Name");

        fName.setCellValueFactory(new PropertyValueFactory<>(
                persons.get(0).firstNameProperty().getName()
        ));
        lName.setCellValueFactory(new PropertyValueFactory<>(
                persons.get(1).lastNameProperty().getName()
        ));

        tableView.getColumns().setAll(fName, lName);
        tableView.setPrefSize(200, 100);

        HBox root = new HBox(tableView);


        primaryStage.setScene(new Scene(root, 250, 250));
        primaryStage.setTitle("JavaFX");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
