package com.javaondemand.graphics;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class RectangleExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(120);
        rectangle.setHeight(120);

        rectangle.setLayoutX(100);
        rectangle.setLayoutY(50);

        //add effects
        rectangle.setFill(Color.DARKBLUE);
        rectangle.setEffect(new DropShadow(10.0, Color.RED));

        Group root = new Group();
        root.getChildren().addAll(rectangle);
        Scene scene = new Scene(root, 300, 300);
        stage.setTitle("Javafx Rectangle");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
