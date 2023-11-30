package com.project.nextgenapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ShoppingCartController {

    @FXML
    private Button logoutButton;

    @FXML
    private Button payNowButton;

    @FXML
    private Label cartLabel;

    @FXML
    private Label cartItemsLabel;

    @FXML
    private AnchorPane cartAnchorPane;

    private int cartItemCount = 0;

    public void initialize() {
        logoutButton.setOnAction(event -> logout());
        payNowButton.setOnAction(event -> payNow());
    }

    public void addToCart() {
        cartItemCount++;
        cartItemsLabel.setText(String.valueOf(cartItemCount));
    }

    private void logout() {
        Stage stage = (Stage) logoutButton.getScene().getWindow();
        stage.close();
    }

    private void payNow() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("payment.fxml"));
            AnchorPane root = fxmlLoader.load();
            ShoppingCartController shoppingCartController = fxmlLoader.getController();
            shoppingCartController.addToCart();

            Stage stage = new Stage();
            stage.setTitle("Payment");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
