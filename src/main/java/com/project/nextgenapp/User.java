package com.project.nextgenapp;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties (ignoreUnknown = true)
public class User {
    private static int uniqueID = 1;
    @JsonProperty("userID")
    private int userID;
    private String firstName;
    private String userName;
    private String password;
    private String shippingAddress;
    private boolean isAdmin = false;

    public User() {

    }

    public User(String firstName, String userName, String password, String shippingAddress) {
        this.userID = ++uniqueID;
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

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}

