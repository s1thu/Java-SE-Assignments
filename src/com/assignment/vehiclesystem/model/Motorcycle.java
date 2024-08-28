package com.assignment.vehiclesystem.model;

public class Motorcycle extends Vehicle{
    private boolean hasSidecar;

    public Motorcycle(String model, String brand, boolean sidecar) {
        super(model, brand);
        this.hasSidecar = sidecar;
    }

    public Motorcycle(Vehicle vehicle, boolean sidecar) {
        super(vehicle.getModel(), vehicle.getBrand());
        this.hasSidecar = sidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}
