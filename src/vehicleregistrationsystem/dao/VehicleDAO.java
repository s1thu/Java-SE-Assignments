package vehicleregistrationsystem.dao;

import vehicleregistrationsystem.model.Car;
import vehicleregistrationsystem.model.Vehicle;

public class VehicleDAO {

    public static Vehicle[] vehicles = new Vehicle[Vehicle.MAX_VEHICLE_COUNT];;

    static{
        System.out.println("VehicleDAO static block");
        insertVehicle(new Car("Honda", "Civic", 4));
        insertVehicle(new Car("Toyota", "Corolla", 4));
        insertVehicle(new Car("Toyota", "Camry", 4));
        insertVehicle(new Car("Toyota", "Prius", 4));
        insertVehicle(new Car("Toyota", "Yaris", 4));
        insertVehicle(new Car("Toyota", "Avalon", 4));
        insertVehicle(new Car("Toyota", "Highlander", 4));
        insertVehicle(new Car("Toyota", "4Runner", 4));
        insertVehicle(new Car("Toyota", "Sequoia", 4));
        insertVehicle(new Car("Toyota", "Land Cruiser", 4));
        System.out.println("VehicleDAO static block end");
    }
    public static void insertVehicle(Vehicle vehicle){
        vehicles[vehicle.getTotalVehicle()-1] = vehicle;
    }

    public static Vehicle[] getAllVehicles() {
        return vehicles;
    }

    public static Vehicle getVehicleById(int id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == id) {
                return vehicle;
            }
        }
        return null;
    }
}
