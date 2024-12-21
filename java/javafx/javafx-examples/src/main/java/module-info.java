module com.javaondemand {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.javaondemand to javafx.fxml;
    exports com.javaondemand;
    exports com.javaondemand.layout;
    exports com.javaondemand.practice;
    exports com.javaondemand.practice.chart;
    exports com.javaondemand.controller;
    exports com.javaondemand.chart.piechart;
    exports com.javaondemand.chart.linechart;
    exports com.javaondemand.chart.barchart;
    exports com.javaondemand.chart;
    exports com.javaondemand.graphics;
    exports com.javaondemand.examples;
    exports com.javaondemand.examples.controller;
}