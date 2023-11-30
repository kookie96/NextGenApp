package com.project.nextgenapp;

public class ShippingType {
    public int shippingTypeID;
    public String name;
    public float price;

    public ShippingType() {
    }

    public int getShippingTypeID() {
        return shippingTypeID;
    }

    public void setShippingTypeID(int shippingTypeID) {
        this.shippingTypeID = shippingTypeID;
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

    @Override
    public String toString() {
        return "ShippingType{" +
                "shippingTypeID=" + shippingTypeID +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
