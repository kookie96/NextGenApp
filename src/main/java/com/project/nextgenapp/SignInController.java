package com.project.nextgenapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignInController {

    @FXML
    private Label usernameLabel;

    @FXML
    private TextField usernameTextField;

    @FXML
    private Label passwordLabel;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Button signUpButton;

    @FXML
    protected void onLoginButtonClick() {
        System.out.println("Login button clicked");
        String username = usernameTextField.getText();
        String password = passwordField.getText();

        if(username.equals("user") && password.equals("pass")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid username or password");
        }
    }

    @FXML
    protected void onSignUpButtonClick() {
        System.out.println("Sign Up button clicked");
        String username = usernameTextField.getText();
        String password = passwordField.getText();

        if(username.equals("") || password.equals("")) {
            System.out.println("Invalid username or password");
        } else {
            System.out.println("Account created");
        }
    }
}
