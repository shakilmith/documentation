package com.javaondemand.chart.linechart;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LineChartExample1 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        //creating numberAxis and CategoryAxis
        final NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("Number of Month");
        final NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Progress");
        //create LineChart and add xAxis and yAxis instance
       final LineChart<Number, Number> lineChart = new LineChart<Number, Number>(xAxis, yAxis);


       //set the lineChart title
       lineChart.setTitle("Stock Monitoring");

       //creating series of data

        XYChart.Series series = new XYChart.Series();
        series.setName("My portfolio");


        //populating the series with data


        series.getData().add(new XYChart.Data<>(1, 23));
        series.getData().add(new XYChart.Data<>(2, 14));
        series.getData().add(new XYChart.Data<>(3, 25));
        series.getData().add(new XYChart.Data<>(4, 24));
        series.getData().add(new XYChart.Data<>(5, 36));
        series.getData().add(new XYChart.Data<>(6, 22));
        series.getData().add(new XYChart.Data<>(7, 45));
        series.getData().add(new XYChart.Data<>(8, 43));
        series.getData().add(new XYChart.Data<>(9, 17));
        series.getData().add(new XYChart.Data<>(10, 29));
        series.getData().add(new XYChart.Data<>(11, 25));
        series.getData().add(new XYChart.Data<>(12, 34));


        //add series to the lineChart
        lineChart.getData().add(series);
        lineChart.setMaxWidth(300);
        lineChart.setMaxHeight(300);
        lineChart.setStyle("-fx-font: 20 arial; -fx-background-color: darkgray");


        //creating group
        HBox root = new HBox();
        root.getChildren().add(lineChart);

        Scene scene = new Scene(root, 600, 500);
        stage.setTitle("Javafx PieChart");
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
