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
import java.util.List;
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

    private final ObservableList<ShowInventory> inventoryOBList =
            FXCollections.observableArrayList();

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        try {
            itemPhoto.setCellValueFactory(new PropertyValueFactory<>("photo"));
            itemName.setCellValueFactory(new PropertyValueFactory<>("name"));
            itemDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
            itemPrice.setCellValueFactory(new PropertyValueFactory<>("price"));

            // Get Inventory from JSON File
            List<Inventory> inventoryList = getInventory();
            getShowItem(inventoryList);

            /*
            ImageView itemPhoto1 = new ImageView(new Image(new FileInputStream("appimages/fortnite-shirt.jpeg")));
            itemPhoto1.setFitHeight(100);
            itemPhoto1.setFitWidth(100);
            ShowInventory showItem = new ShowInventory(itemPhoto1, "Fortnite Shirt",
                    "New Exclusive Shirt", 20.99f);
            inventoryOBList.add(showItem);

             */
            tableView.setItems(inventoryOBList);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<Inventory> getInventory() throws IOException {
        DatabaseManager dm = new DatabaseManager();
        ApplicationData apd = dm.getDataContainer();
        return apd.inventory;
    }

    private void getShowItem(List<Inventory> inventoryList) throws FileNotFoundException {
        for (Inventory item : inventoryList) {
            String name = item.getName();
            String description = item.getDescription();
            float price = item.getPrice();

            if (name.contains("Fortnite Black")) {
                ImageView itemPhoto1 = new ImageView(new Image(new FileInputStream("appimages/fortnite-shirt.jpeg")));
                itemPhoto1.setFitHeight(100);
                itemPhoto1.setFitWidth(100);
                ShowInventory showItem = new ShowInventory(itemPhoto1, name,
                        description, price);
                inventoryOBList.add(showItem);
            } else if (name.contains("Fortnite - Peely")) {
                ImageView itemPhoto1 = new ImageView(new Image(new FileInputStream("appimages/fortnite-funko-pop.jpg")));
                itemPhoto1.setFitHeight(100);
                itemPhoto1.setFitWidth(100);
                ShowInventory showItem = new ShowInventory(itemPhoto1, name,
                        description, price);
                inventoryOBList.add(showItem);
            } else if (name.contains("Ghost - Device Stand")) {
                ImageView itemPhoto1 = new ImageView(new Image(new FileInputStream("appimages/callofduty-stand.jpg")));
                itemPhoto1.setFitHeight(130);
                itemPhoto1.setFitWidth(100);
                ShowInventory showItem = new ShowInventory(itemPhoto1, name,
                        description, price);
                inventoryOBList.add(showItem);
            } else if (name.contains("Fortnite - Dark Vanguard")) {
                ImageView itemPhoto1 = new ImageView(new Image(new FileInputStream("appimages/fortnite-dark-vanguard.jpg")));
                itemPhoto1.setFitHeight(100);
                itemPhoto1.setFitWidth(100);
                ShowInventory showItem = new ShowInventory(itemPhoto1, name,
                        description, price);
                inventoryOBList.add(showItem);
            } else if (name.contains("Task Force 141")) {
                ImageView itemPhoto1 = new ImageView(new Image(new FileInputStream("appimages/cod-task-force.jpg")));
                itemPhoto1.setFitHeight(100);
                itemPhoto1.setFitWidth(100);
                ShowInventory showItem = new ShowInventory(itemPhoto1, name,
                        description, price);
                inventoryOBList.add(showItem);
            }
            else {
                ImageView itemPhoto1 = new ImageView(new Image(new FileInputStream("appimages/cod-black-ops.jpg")));
                itemPhoto1.setFitHeight(100);
                itemPhoto1.setFitWidth(100);
                ShowInventory showItem = new ShowInventory(itemPhoto1, name,
                        description, price);
                inventoryOBList.add(showItem);
            }
        }
    }


}