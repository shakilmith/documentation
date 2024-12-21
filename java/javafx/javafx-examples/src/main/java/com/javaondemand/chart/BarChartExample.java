package com.javaondemand.chart;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class BarChartExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        //creating categoryAxis and numberAxis
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();

        //creating BarChart with xAxis and yAxis
        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
        //providing label to xAxis and yAxis
        xAxis.setLabel("Country");
        yAxis.setLabel("Number of Users");
        //add a title in the BarChart
        barChart.setTitle("Social Media Overview");

        //set horizontal and vertical gridLinesVisible to false
        barChart.setHorizontalGridLinesVisible(false);
        barChart.setVerticalGridLinesVisible(false);

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
        barChart.getData().addAll(series1, series2);

        //add events to barchart

        Label caption =  new Label("");
        caption.setTextFill(Color.BLACK);
        caption.setFont(Font.font("Arial", 12));

        //add mouse event to BarChart bars

        for(final XYChart.Series<String, Number> series: barChart.getData()){
            for(XYChart.Data<String, Number> data: series.getData()){
              data.getNode().addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
                  @Override
                  public void handle(MouseEvent mouseEvent) {
                      caption.setTranslateX(mouseEvent.getSceneX());
                      caption.setTranslateY(mouseEvent.getSceneY());
                      caption.setText(data.getYValue().toString() + " M");

                  }
              });
            }
        }

        barChart.setBarGap(15);
        barChart.setCategoryGap(15);

        //creating HBox
        Group root = new Group();
        root.getChildren().addAll(barChart, caption);

        Scene scene = new Scene(root, 300, 300);
        stage.setTitle("Javafx BarChart");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
