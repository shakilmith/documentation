package com.javaondemand.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class LayoutExample extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Label label = new Label("AnchorPane Example");

        Button button = new Button("Click Me");

        AnchorPane anchorPane = new AnchorPane();
        AnchorPane.setTopAnchor(label, 10.5);
        AnchorPane.setLeftAnchor(label, 50.5);
        AnchorPane.setRightAnchor(label, 50.5);
        AnchorPane.setBottomAnchor(label, 10.5);
        //
        anchorPane.getChildren().add(label);

        //
        anchorPane.getChildren().add(button);

        AnchorPane.setTopAnchor(button, 100.5);
        AnchorPane.setLeftAnchor(button, 200.5);
        AnchorPane.setRightAnchor(button, 20.5);
        AnchorPane.setBottomAnchor(button, 100.5);

        anchorPane.setMinHeight(100);
        anchorPane.setMinWidth(100);


        Scene scene = new Scene(anchorPane,300,300);
        stage.setTitle("Sample JavaFX Application!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
