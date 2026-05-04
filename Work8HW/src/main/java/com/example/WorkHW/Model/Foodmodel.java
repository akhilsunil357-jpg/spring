package com.example.WorkHW.Model;

public class Foodmodel {

    private String name;
    private Double price;

    // Default constructor
    public Foodmodel() {
    }

    // Parameterized constructor
    public Foodmodel(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    // Getter & Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter & Setter for price
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}