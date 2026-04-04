package com.example.gui_member5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class NumberCounterApplication extends Application  {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(NumberCounterApplication.class.getResource("number-counter.fxml"));
        Scene scene = new Scene(loader.load(), 320, 240);
        stage.setTitle("Number Counter");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
