package com.javaondemand.chart;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public class StackedBarChartExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {



        //creating categoryAxis and numberAxis
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();

        //creating BarChart with xAxis and yAxis
        StackedBarChart<String, Number> stackedBarChart = new StackedBarChart<>(xAxis, yAxis);
        //providing label to xAxis and yAxis
        xAxis.setLabel("Country");
        yAxis.setLabel("Number of Users");
        //add a title in the BarChart
        stackedBarChart.setTitle("Social Media Overview");


        //creating XYChart.Series
        XYChart.Series<String, Number> series1 = new XYChart.Series<>();

        XYChart.Series<String, Number> series2 = new XYChart.Series<>();

        //name of the series
        series1.setName("2023");
        series2.setName("2027");


        //add list of data to series1
        series1.getData().add(new XYChart.Data<>("China", 1021.96));
        series1.getData().add(new XYChart.Data<>("India", 755.47));
        series1.getData().add(new XYChart.Data<>("USA", 755.47));
        series1.getData().add(new XYChart.Data<>("Indonesia", 755.47));


        //add list of data to series2
        series2.getData().add(new XYChart.Data<>("China", 1212.38));
        series2.getData().add(new XYChart.Data<>("India", 1177.5));
        series2.getData().add(new XYChart.Data<>("USA", 327.22));
        series2.getData().add(new XYChart.Data<>("Indonesia", 261.7));

        //now, add series1 and series2 to barchart
        stackedBarChart.getData().addAll(series1, series2);


        //adding timeline animation
        Timeline timeline = new Timeline();
        timeline.getKeyFrames().add(
                new KeyFrame(Duration.millis(500), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        for(XYChart.Series<String, Number> series: stackedBarChart.getData()){
                            for(XYChart.Data<String, Number> data:  series.getData()){
                                data.setYValue(Math.random() * 1000);
                            }
                        }
                    }
                })
        );

        xAxis.setAnimated(false);

        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.setAutoReverse(true);
        timeline.play();

        Scene scene = new Scene(stackedBarChart, 300, 300);
        stage.setTitle("Javafx PieChart");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
