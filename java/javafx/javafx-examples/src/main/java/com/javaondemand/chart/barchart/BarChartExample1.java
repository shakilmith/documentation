package com.javaondemand.chart.barchart;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class BarChartExample1 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        //CategoryAxis and NumberAxis
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Devices");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Visits");

        //Creating BarChart
       BarChart barChart = new BarChart<>(xAxis, yAxis);
       barChart.setTitle("Visitors Count");

       //creating data series
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("2014");

        series1.getData().add(new XYChart.Data("Desktop", 178));
        series1.getData().add(new XYChart.Data("Phone", 65));
        series1.getData().add(new XYChart.Data("Tablet", 23));

        //add data series to barchart
        barChart.getData().add(series1);


        //creating data series
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("2015");

        series2.getData().add(new XYChart.Data("Desktop", 570));
        series2.getData().add(new XYChart.Data("Phone", 800));
        series2.getData().add(new XYChart.Data("Tablet", 250));

        barChart.getData().add(series2);


        barChart.setBarGap(5);
        barChart.setStyle("-fx-background-color: darkgray");
        //creating group
        HBox root = new HBox(barChart);

        Scene scene = new Scene(root, 300, 300);
        stage.setTitle("Javafx PieChart");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
