package com.assignment.vehiclesystem.model;

public class Motorcycle extends Vehicle{
    private boolean hasSidecar;
    static int total = 0;

    public Motorcycle(String model, String brand, boolean sidecar) {
        super(model, brand,true);
        this.hasSidecar = sidecar;
    }

    public Motorcycle(Vehicle vehicle, boolean sidecar) {
        super(vehicle.getModel(), vehicle.getBrand(),false);
        this.hasSidecar = sidecar;
        total++;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}
