package com.javaondemand.chart;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PieChartExample extends Application {
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
        final PieChart pieChart = new PieChart(pieChartData);

        //add chart title
        pieChart.setTitle("Imported Fruits");




        //we add here dropShadow effect on our PieChart
        pieChart.setEffect(new DropShadow(20, Color.ROSYBROWN));



        HBox root = new HBox(pieChart);

        Scene scene = new Scene(root, 300, 300);
        stage.setTitle("Javafx PieChart");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
