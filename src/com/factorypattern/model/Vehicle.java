package com.factorypattern.model;

public class Vehicle {
    private String model;
    private String brand;
    private String id;
    private static int vehicleCount = 0;

    public Vehicle(String model, String brand) {
        this.model = model;
        this.brand = brand;
        this.id = "V" + vehicleCount++;
    }
}
