package vehicleregistrationsystem.model;

public class Truck extends Vehicle {
    private int payloadCapacity;

    public Truck(String model, String brand, int loadCapacity) {
        super(model, brand,true);
        this.payloadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck Information =====================");
        super.displayInfo();
        System.out.println("Payload Capacity: " + payloadCapacity);
    }
}
