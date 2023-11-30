package com.project.nextgenapp;

public class Sale {
    public int userID;
    public int inventoryID;
    public int shippingTypeID;
    public String dateOfSale;
    public float tax;
    public float grandTotal;

    public Sale() {
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

    @Override
    public String toString() {
        return "Sale{" +
                "userID=" + userID +
                ", inventoryID=" + inventoryID +
                ", shippingTypeID=" + shippingTypeID +
                ", dateOfSale='" + dateOfSale + '\'' +
                ", tax=" + tax +
                ", grandTotal=" + grandTotal +
                '}';
    }
}
