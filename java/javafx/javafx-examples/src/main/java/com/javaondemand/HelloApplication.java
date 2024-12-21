package com.javaondemand;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane grid = new GridPane();

        grid.setPadding(new Insets(10, 10, 10, 10));

        grid.setVgap(5);
        grid.setHgap(5);

        //name textField
        TextField name = new TextField();
        name.setPromptText("Enter Your Name");

        GridPane.setConstraints(name, 0, 0);
        grid.getChildren().add(name);

        //last name
        TextField lastName = new TextField();
        lastName.setPromptText("Enter Your Last Name");

        GridPane.setConstraints(lastName, 0, 1);
        grid.getChildren().add(lastName);

        //comment

        TextField comment = new TextField();
        comment.setPromptText("Enter Your Comment");
        GridPane.setConstraints(comment, 0, 2);
        grid.getChildren().add(comment);

        //submit button

        Button submit = new Button("Submit");
        GridPane.setConstraints(submit, 1, 0);
        grid.getChildren().add(submit);

        //clear button
        Button clear = new Button("Clear");
        GridPane.setConstraints(clear, 1, 1);
        grid.getChildren().add(clear);


        //create a label

        Label label = new Label();
        GridPane.setConstraints(label, 0, 3);
        GridPane.setColumnSpan(label, 2);
        grid.getChildren().add(label);


        //submit action

        submit.setOnAction(e -> {
            if(comment.getText() != null && !comment.getText().isEmpty()){
                label.setText(name.getText() + " "+
                        lastName.getText()+ " "+
                        "Thank You for Your Comment"
                );
            }
            else {
                label.setText("You have not left a comment");
            }
        });

        //clear action
        clear.setOnAction((ActionEvent e) -> {
            name.clear();
            lastName.clear();
            comment.clear();
            lastName.clear();
            label.setText(null);
        });


        primaryStage.setScene(new Scene(grid, 300, 300));
        primaryStage.setTitle("JavaFX FlowPane");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}