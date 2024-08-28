package com.assignment.vehiclesystem.model;

public class Vehicle {
    private String model;
    private String brand;

    public Vehicle(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public void displayInfo(){
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
