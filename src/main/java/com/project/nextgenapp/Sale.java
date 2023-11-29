package com.project.nextgenapp;

public class Sale {
    private int userID;
    private int inventoryID;
    private int shippingTypeID;
    private String dateOfSale; // Format: YYYY-MM-DD.
    private float tax; // tax = 6% of subtotal
    private float grandTotal;

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


