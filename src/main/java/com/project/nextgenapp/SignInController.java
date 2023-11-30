package com.project.nextgenapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class SignInController {

    @FXML
    private Label usernameLabel;

    @FXML
    private TextField usernameTextField;

    @FXML
    private Label passwordLabel;

    @FXML
    private TextField passwordTextField;

    @FXML
    private Button loginButton;

    @FXML
    private Button signUpButton;

    @FXML
    private Label warningLabel;

    @FXML
    protected void onLoginButtonClick() {
        try {
            String username = usernameTextField.getText();
            String password = passwordTextField.getText();

            if (username.isEmpty() || password.isEmpty()) {
                throw new Exception("Please enter username AND password.");
            }

            List<User> userList = getUsers();
            if (userValidation(userList, username, password)) {
                goToInventoryPage();
            } else {
                throw new Exception("Invalid username and password.");
            }


        } catch (Exception e) {
            warningLabel.setText(e.getMessage());
        }
    }


    @FXML
    protected void onSignUpButtonClick() throws IOException {
        goToSignUpPage();
    }

    private List<User> getUsers() throws IOException {
        DatabaseManager dm = new DatabaseManager();
        ApplicationData apd = dm.getDataContainer();
        return apd.users;
    }

    private boolean userValidation(List<User> userList, String username, String password) {
        for (User user : userList) {
            if (username.equals(user.userName) && password.equals(user.password)) {
                return true;
            }

        }
        return false;
    }
    @FXML
    protected void goToInventoryPage() throws IOException {
        // Call getScene() on any node that isn't null. Any node could be chosen
        // from this controller. Then, typecast window to stage
        Stage stage = (Stage) warningLabel.getScene().getWindow();

        // Copy/paste start method in driver and change fxml file
        FXMLLoader fxmlLoader = new FXMLLoader(InventoryApplication.class.getResource("inventory" +
                "-list-page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 850, 600);
        stage.setTitle("NextGen");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void goToSignUpPage() throws IOException {
        // Call getScene() on any node that isn't null. Any node could be chosen
        // from this controller. Then, typecast window to stage
        Stage stage = (Stage) warningLabel.getScene().getWindow();

        FXMLLoader fxmlLoader = new FXMLLoader(InventoryApplication.class.getResource(
                "CreateAccount.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 850, 600);
        stage.setTitle("Create Account");
        stage.setScene(scene);
        stage.show();
    }
}
