package com.project.nextgenapp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShippingType {
    private static int uniqueID = 0;
    @JsonProperty("shippingTypeID")
    private int shippingTypeId;
    private String name;
    private float price;

    ShippingType() {
        // Default Constructor
    }

    ShippingType(String name, float price) {
        this.name = name;
        this.price = price;
        this.shippingTypeId = ++uniqueID;
    }

    public int getShippingTypeId() {
        return shippingTypeId;
    }

    public void setShippingTypeId(int shippingTypeId) {
        this.shippingTypeId = shippingTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
