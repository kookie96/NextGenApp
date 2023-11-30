package com.project.nextgenapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginApplication.class.getResource("login-page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("NextGen ");
        stage.setScene(scene);
        stage.show();

        // TEST
        DatabaseManager dm = new DatabaseManager();
        ApplicationData apd = new ApplicationData();
        apd = dm.getDataContainer();
        System.out.println(apd.users);
        System.out.println(apd.inventory);
        System.out.println(apd.sales);
        System.out.println(apd.shippingTypes);
    }

    public static void main(String[] args) {
        launch();
    }
}