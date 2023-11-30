package com.project.nextgenapp;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CreateAccountController {

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField usernameField;

    @FXML
    private TextField passwordField;

    @FXML
    private Button signupButton;

    @FXML
    private Label loginLabel;
    private boolean signUpSuccessful;

    public void initialize() {
        signupButton.setOnAction(event -> {
            String firstName = firstNameField.getText();
            String username = usernameField.getText();
            String password = passwordField.getText();

            // Validate user input
            if (firstName.isEmpty()) {
                showAlert("Please enter your first name");
                return;
            }

            if (username.isEmpty()) {
                showAlert("Please enter a username");
                return;
            }

            if (password.isEmpty()) {
                showAlert("Please enter a password");
                return;
            }

            // TODO: Implement sign up logic here (e.g., create user account in database)

            // If sign up is successful, clear fields and display success message
            if (signUpSuccessful) {
                firstNameField.clear();
                usernameField.clear();
                passwordField.clear();

                showAlert("Sign up successful!");
            } else {
                showAlert("Sign up failed. Please try again");
            }
        });
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sign Up");
        alert.setContentText(message);
        alert.showAndWait();
    }
}


