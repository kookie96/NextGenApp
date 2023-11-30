package com.project.nextgenapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateAccountController {

    @FXML
    private Label createAccountLabel;

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField usernameTextField;

    @FXML
    private TextField passwordTextField;

    @FXML
    private Button signUpButton;

    @FXML
    private Button loginButton;

    @FXML
    protected void goToInventoryPage() throws IOException {
        // Call getScene() on any node that isn't null. Any node could be chosen
        // from this controller. Then, typecast window to stage
        Stage stage = (Stage) createAccountLabel.getScene().getWindow();

        // Copy/paste start method in driver and change fxml file
        FXMLLoader fxmlLoader = new FXMLLoader(InventoryApplication.class.getResource("inventory" +
                "-list-page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 850, 600);
        stage.setTitle("NextGen");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void goToLoginPage() throws IOException {
        // Call getScene() on any node that isn't null. Any node could be chosen
        // from this controller. Then, typecast window to stage
        createAccountLabel.setText("Create Account");
        Stage stage = (Stage) createAccountLabel.getScene().getWindow();

        // Copy/paste start method in driver and change fxml file
        FXMLLoader fxmlLoader = new FXMLLoader(InventoryApplication.class.getResource("SignIn" +
                ".fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 850, 600);
        stage.setTitle("NextGen");
        stage.setScene(scene);
        stage.show();
    }


}


