package vehicleregistrationsystem.model;

public class Vehicle {

    private int id;
    private String model;
    private String brand;
    private static int totalVehicle = 0;
    public static final int MAX_VEHICLE_COUNT = 1000;

    public Vehicle(String model, String brand,boolean isService) {
        this.model = model;
        this.brand = brand;
        if (isService) {
            totalVehicle++;
            this.id = totalVehicle;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void displayInfo(){
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
    }

    public int getId() {
        return id;
    }

    public static int getTotalVehicle() {
        return totalVehicle;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
