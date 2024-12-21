package com.javaondemand.chart.piechart;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Side;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class PieChartExample1 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        //creating List of PieChart.Data
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("GrapeFruit", 13),
                new PieChart.Data("Oranges", 25),
                new PieChart.Data("Plums", 10),
                new PieChart.Data("Pears", 30),
                new PieChart.Data("Apples", 30)
        );

        //Creating PieChart
        final PieChart chart = new PieChart(pieChartData);

        //add chart title
        chart.setTitle("Imported Fruits");
        chart.setLegendVisible(true);

        //set Legends position to right side
        chart.setLegendSide(Side.RIGHT);

        chart.setEffect(new DropShadow(20, Color.ROSYBROWN));


        //Adding events to pieChart slice
        //creating caption or title when you mouse click on the pie slice

        final Label caption = new Label("");
        caption.setTextFill(Color.DARKBLUE);
        caption.setFont(Font.font("Arial", 24));





        //Add event handler to pieChart
        for(final PieChart.Data data : chart.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    caption.setTranslateX(mouseEvent.getSceneX());
                    caption.setTranslateY(mouseEvent.getSceneY());
                    caption.setText(String.valueOf(data.getPieValue() + "%"));
                    chart.setAnimated(true);
                }
            });
        }



        //creating group
        Group root = new Group();
        root.getChildren().addAll(chart, caption);

        Scene scene = new Scene(root, 600, 500);
        stage.setTitle("Javafx PieChart");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
