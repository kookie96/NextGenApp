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
}
