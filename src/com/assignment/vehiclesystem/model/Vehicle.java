package com.assignment.vehiclesystem.model;

public class Vehicle {
    public static final int MAX_VEHICLES = 100;
    private String model;
    private String brand;
    private static int vehicleTotal = 0;

    public Vehicle(String model, String brand,boolean increment) {
        this.model = model;
        this.brand = brand;
        if (increment) {
            vehicleTotal++;
        }
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

    public static int getTotal() {
        return vehicleTotal;
    }
}
