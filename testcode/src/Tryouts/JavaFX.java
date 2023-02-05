/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tryouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class JavaFX extends Application {
   @Override
   public void start(Stage stage) {
      CategoryAxis xAxis = new CategoryAxis();
      xAxis.setLabel("Month");
      NumberAxis yAxis = new NumberAxis();
      yAxis.setLabel("Amount");
      BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
      barChart.setTitle("Monthly Sales");
      XYChart.Series<String, Number> data = new XYChart.Series<>();
      data.setName("Amount");
      data.getData().add(new XYChart.Data<>("Jan 2016", 2500));
      data.getData().add(new XYChart.Data<>("Feb 2016", 1600));
      data.getData().add(new XYChart.Data<>("Mar 2016", 2000));
      data.getData().add(new XYChart.Data<>("Apr 2016", 2700));
      data.getData().add(new XYChart.Data<>("May 2016", 3200));
      data.getData().add(new XYChart.Data<>("Jun 2016", 800));
      barChart.getData().add(data);
      Scene scene = new Scene(barChart, 800, 600);
      stage.setScene(scene);
      stage.setTitle("L1Q4");
      stage.show();
   }

   public static void main(String[] args) {
      launch(args);
   }
}