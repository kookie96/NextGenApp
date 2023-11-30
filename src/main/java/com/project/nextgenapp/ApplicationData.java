package com.project.nextgenapp;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class ApplicationData {
    @JsonProperty("Users")
    public ArrayList<User> users;
    @JsonProperty("Inventory")
    public ArrayList<Inventory> inventory;
    @JsonProperty("Sales")
    public ArrayList<Sale> sales;
    @JsonProperty("ShippingTypes")
    public ArrayList<ShippingType> shippingTypes;

    public ApplicationData() {
        // Default Constructor
    }

    public ApplicationData(ArrayList<User> users, ArrayList<Inventory> inventory,
                           ArrayList<Sale> sales, ArrayList<ShippingType> shippingTypes) {
        this.users = users;
        this.inventory = inventory;
        this.sales = sales;
        this.shippingTypes = shippingTypes;
    }
}
