package com.javaondemand.chart;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HorizontalBarChartExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        //creating categoryAxis and numberAxis for horizontal BarChart
        CategoryAxis yAxis = new CategoryAxis();
        NumberAxis xAxis = new NumberAxis();

        //creating BarChart with xAxis and yAxis
        BarChart<Number, String> barChart = new BarChart<>(xAxis, yAxis);

        //providing label to xAxis and yAxis
        yAxis.setLabel("Country");
        xAxis.setLabel("Number of Users");
        //add a title in the BarChart
        barChart.setTitle("Country Overview");

        //override horizontal and vertical GridLinesVisible
        barChart.setHorizontalGridLinesVisible(false);
        barChart.setVerticalGridLinesVisible(false);

        //barGap and categoryGap
        barChart.setBarGap(5);
        barChart.setCategoryGap(10);


        //creating XYChart.Series
        XYChart.Series<Number, String> series1 = new XYChart.Series<>();
        XYChart.Series<Number, String> series2 = new XYChart.Series<>();

        //name of the series
        series1.setName("2023");
        series2.setName("2027");


        //add list of data to series1
        series1.getData().add(new XYChart.Data<>(1021.96,"China"));
        series1.getData().add(new XYChart.Data<>(755.47, "India"));
        series1.getData().add(new XYChart.Data<>(755.47, "USA"));
        series1.getData().add(new XYChart.Data<>(755.47, "Indonesia"));

        //add list of data to series2
        series2.getData().add(new XYChart.Data<>(1212.38, "China"));
        series2.getData().add(new XYChart.Data<>(1177.5, "India"));
        series2.getData().add(new XYChart.Data<>(327.22,"USA"));
        series2.getData().add(new XYChart.Data<>(261.7, "Indonesia"));

        //now, add series1 and series2 to barchart
        barChart.getData().addAll(series1, series2);


        //creating HBox
        VBox root = new VBox();
        root.getChildren().add(barChart);

        Scene scene = new Scene(root, 300, 300);
        stage.setTitle("Javafx BarChart");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
