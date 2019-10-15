package com.example.nestedrecyclerview.model;

public class Child {
    String description,price;

    public Child(String description, String price) {
        this.description = description;
        this.price = price;
    }

    public Child() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
