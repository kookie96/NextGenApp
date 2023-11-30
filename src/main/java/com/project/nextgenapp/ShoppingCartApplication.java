package com.project.nextgenapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ShoppingCartApplication extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Shopping_Cart.fxml"));
            Parent root = loader.load();

            // Set the title of the stage
            primaryStage.setTitle("Shopping Cart");

            // Set the scene of the stage
            primaryStage.setScene(new Scene(root));

            // Show the stage
            primaryStage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }
    }


