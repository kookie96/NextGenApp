package com.project.nextgenapp;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ShippingType {
    @JsonProperty("shippingTypeID")
    public int shippingTypeId;
    public String name;
    public float price;

    ShippingType() {
        // Default Constructor
    }

    ShippingType(String name, float price, int shippingTypeId) {
        this.name = name;
        this.price = price;
        this.shippingTypeId = shippingTypeId;
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
