package com.project.nextgenapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SignInApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Username label
        Label usernameLabel = new Label("Username:");

        // Username text field
        TextField usernameTextField = new TextField();

        // Password label
        Label passwordLabel = new Label("Password:");

        // Password field
        PasswordField passwordField = new PasswordField();

        // Login button
        Button loginButton = new Button("Login");

        // Sign Up button
        Button signUpButton = new Button("Sign Up");

        // Set up the layout
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20));
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(usernameLabel, usernameTextField, passwordLabel, passwordField, loginButton, signUpButton);

        // Create a scene and add it to the stage
        Scene scene = new Scene(vbox, 300, 250);
        primaryStage.setTitle("Login Interface");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

   }
