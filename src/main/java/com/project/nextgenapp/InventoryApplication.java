package com.project.nextgenapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class InventoryApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(InventoryApplication.class.getResource("inventory" +
                "-list-page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 850, 600);
        stage.setTitle("NextGen");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}