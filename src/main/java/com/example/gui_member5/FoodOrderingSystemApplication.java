package com.example.gui_member5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class FoodOrderingSystemApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(FoodOrderingSystemApplication.class.getResource("food-ordering-system.fxml"));
        Scene scene = new Scene(loader.load(),420,320);
        stage.setTitle("Food Ordering System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
