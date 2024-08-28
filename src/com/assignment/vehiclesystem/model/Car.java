package com.assignment.vehiclesystem.model;

public class Car extends Vehicle{

    private String doors;
    static int total = 0;

    public Car(String model, String brand, String doors) {
        super(model, brand);
        this.doors = doors;
    }

    public Car(Vehicle vehicle, String doors) {
        super(vehicle.getModel(), vehicle.getBrand());
        this.doors = doors;
        total++;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + doors);
    }
}
