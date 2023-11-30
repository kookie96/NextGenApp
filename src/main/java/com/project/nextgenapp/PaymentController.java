package com.project.nextgenapp;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class PaymentController {
    @FXML
    private TableView<PaymentApplication> itemTable;

    @FXML
    private TableColumn<PaymentApplication, String> nameColumn;

    @FXML
    private TableColumn<PaymentApplication, Double> priceColumn;

    @FXML
    private Button addButton;

    @FXML
    private Button checkoutButton;

    public void initialize() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        ObservableList<PaymentApplication> items = FXCollections.observableArrayList(
                new PaymentApplication("Item 1", 10.99),
                new PaymentApplication("Item 2", 12.50),
                new PaymentApplication("Item 3", 14.99)
        );

        itemTable.setItems(items);
    }
}
