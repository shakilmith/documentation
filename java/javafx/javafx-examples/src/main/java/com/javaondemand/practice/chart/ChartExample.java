package com.javaondemand.practice.chart;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Side;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class ChartExample extends Application {



    @Override
    public void start(Stage stage) throws Exception {

        final Label caption = new Label("");
        caption.setTextFill(Color.DARKORANGE);
        caption.setStyle("-fx-font: 24 arial");

        //List of PieChart data

        ObservableList <PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Apple", 13),
                new PieChart.Data("Banana", 25),
                new PieChart.Data("Orange", 10),
                new PieChart.Data("Plums", 22),
                new PieChart.Data("Pears", 30)
        );


        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Imported Fruits");

        chart.setLabelLineLength(40);
        chart.setLabelsVisible(true);
        chart.setLegendVisible(true);
        chart.setLegendSide(Side.LEFT);


        //event on pie slice

        for(final PieChart.Data data : chart.getData()){

            data.getNode().addEventHandler(MouseEvent.MOUSE_PRESSED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent e) {

                            caption.setTranslateX(e.getSceneX());
                            caption.setTranslateY(e.getSceneY());
                            caption.setText(String.valueOf(data.getPieValue()) + "%");
                        }
                    });

        }



        Group root = new Group(chart, caption);

        Scene scene = new Scene(root, 600, 600);

        stage.setScene(scene);
        stage.setTitle("Javafx Chart Demo");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
