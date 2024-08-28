package com.assignment.vehiclesystem.model;

public class Truck extends Vehicle{

    private String payloadCapacity;
    static int total = 0;

    public Truck(String model, String brand, String capacity) {
        super(model, brand);
        this.payloadCapacity = capacity;
    }

    public Truck(Vehicle vehicle, String capacity) {
        super(vehicle.getModel(), vehicle.getBrand());
        this.payloadCapacity = capacity;
        total++;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Capacity: " + payloadCapacity);
    }
}
