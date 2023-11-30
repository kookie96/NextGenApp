package com.project.nextgenapp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sale {
    public int userID;
    public int inventoryID;
    public int shippingTypeID;
    public String dateOfSale; // Format: YYYY-MM-DD.
    public float tax; // tax = 6% of subtotal
    public float grandTotal;

    Sale() {
        // Default constructor
    }

    Sale(int userID, int inventoryID, int shippingTypeID, String dateOfSale, float tax,
         float grandTotal) {
        this.userID = userID;
        this.inventoryID = inventoryID;
        this.shippingTypeID = shippingTypeID;
        this.dateOfSale = dateOfSale;
        this.tax = tax;
        this.grandTotal = grandTotal;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getInventoryID() {
        return inventoryID;
    }

    public void setInventoryID(int inventoryID) {
        this.inventoryID = inventoryID;
    }

    public int getShippingTypeID() {
        return shippingTypeID;
    }

    public void setShippingTypeID(int shippingTypeID) {
        this.shippingTypeID = shippingTypeID;
    }

    public String getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(String dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public float getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(float grandTotal) {
        this.grandTotal = grandTotal;
    }
}


