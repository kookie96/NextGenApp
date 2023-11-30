package com.project.nextgenapp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Inventory {
    @JsonProperty("inventoryID")
    public int inventoryID;
    public String name;
    public String description;
    public float price;

    Inventory() {
        // Default constructor
    }

    Inventory(String name, String description, float price, int inventoryID) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.inventoryID = inventoryID;
    }

    /*
    public static int getUniqueID() {
        return uniqueID;
    }

    public static void setUniqueID(int uniqueID) {
        Inventory.uniqueID = uniqueID;
    }


     */
    public int getInventoryId() {
        return inventoryID;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryID = inventoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
