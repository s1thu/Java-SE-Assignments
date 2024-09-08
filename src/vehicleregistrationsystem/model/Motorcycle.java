package vehicleregistrationsystem.model;

public class Motorcycle extends Vehicle {

    private boolean hasSideCar;

    public Motorcycle(String model, String brand, boolean hasSideCar) {
        super(model, brand,true);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle Information =====================");
        super.displayInfo();
        System.out.println("Has side car: " + (hasSideCar ? "Yes" : "No"));
    }
}
