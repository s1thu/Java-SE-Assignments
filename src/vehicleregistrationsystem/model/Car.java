package vehicleregistrationsystem.model;

public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String model, String brand, int numberOfDoors) {
        super(model, brand,true);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Information =====================");
        super.displayInfo();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}
