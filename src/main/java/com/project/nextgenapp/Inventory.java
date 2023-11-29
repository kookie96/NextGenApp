package com.project.nextgenapp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Inventory {
    private static int uniqueID = 0;
    @JsonProperty("inventoryID")
    private int inventoryId;
    private String name;
    private String description;
    private float price;

    Inventory() {
        // Default constructor
    }

    Inventory(String name, String description, float price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.inventoryId = ++uniqueID;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
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
