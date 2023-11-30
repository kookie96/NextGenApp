package com.project.nextgenapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ShoppingCartApplication extends Application {

        @Override
        public void start(Stage stage) throws Exception {
            FXMLLoader fxmlLoader = new FXMLLoader(SignInApplication.class.getResource("ShoppingCart-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 730,610 );
            stage.setTitle("Cart Page");
            stage.setScene(scene);
            stage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }
    }


