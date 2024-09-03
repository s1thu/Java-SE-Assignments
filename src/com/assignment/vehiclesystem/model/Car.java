package com.assignment.vehiclesystem.model;

public class Car extends Vehicle{

    private String doors;
    static int total = 0;

    public Car(String model, String brand, String doors) {
        super(model, brand,true);
        this.doors = doors;
    }

    public Car(Vehicle vehicle, String doors) {
        super(vehicle.getModel(), vehicle.getBrand(),false);
        this.doors = doors;
        total++;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + doors);
    }
}
