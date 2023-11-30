package com.project.nextgenapp;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class ApplicationData {
    @JsonProperty("Users")
    public List<User> users;
    @JsonProperty("Inventory")
    public List<Inventory> inventory;
    @JsonProperty("Sales")
    public List<Sale> sales;
    @JsonProperty("ShippingTypes")
    public List<ShippingType> shippingTypes;

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
