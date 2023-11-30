package com.project.nextgenapp;

import javafx.scene.image.ImageView;

public class ShowInventory extends Inventory {
    public ImageView photo;

    public ShowInventory(ImageView photo, String name, String description, float price ) {
        this.photo = photo;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public ImageView getPhoto() {
        return photo;
    }

    public void setPhoto(ImageView photo) {
        this.photo = photo;
    }
}
