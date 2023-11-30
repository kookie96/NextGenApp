package com.project.nextgenapp;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class InventoryController implements Initializable {
    @FXML
    private Button addToCartClick;

    @FXML
    private TableView<ShowInventory> tableView;

    @FXML
    private TableColumn<ShowInventory, String> itemDescription;

    @FXML
    private TableColumn<ShowInventory, String> itemName;

    @FXML
    private TableColumn<ShowInventory, ImageView> itemPhoto;

    @FXML
    private TableColumn<ShowInventory, String> itemPrice;

    private final ObservableList<ShowInventory> inventoryList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        try {
            itemPhoto.setCellValueFactory(new PropertyValueFactory<>("photo"));

            itemName.setCellValueFactory(new PropertyValueFactory<>("name"));
            itemDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
            itemPrice.setCellValueFactory(new PropertyValueFactory<>("price"));

            // Get Inventory from JSON File
            DatabaseManager dm = new DatabaseManager();
            ApplicationData apd = dm.getDataContainer();
            ImageView itemPhoto1 = new ImageView(new Image(new FileInputStream("fortnite-shirt.jpeg")));
            itemPhoto1.setFitHeight(100);
            itemPhoto1.setFitWidth(100);
            ShowInventory showItem = new ShowInventory(itemPhoto1, "Fortnite Shirt",
                    "New Exclusive Shirt", 20.99f);
            inventoryList.add(showItem);

            tableView.setItems(inventoryList);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}