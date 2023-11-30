package com.project.nextgenapp;

public class User {
    public int userID;
    public String firstName;
    public String userName;
    public String password;
    public String shippingAddress;
    public boolean isAdmin = false;

    public User() {

    }

    public User(int userID, String firstName, String userName, String password,
                String shippingAddress) {
        this.userID = userID;
        this.firstName = firstName;
        this.userName = userName;
        this.password = password;
        this.shippingAddress = shippingAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", firstName='" + firstName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }
}

