package vehicleregistrationsystem.dao;

import vehicleregistrationsystem.model.Car;
import vehicleregistrationsystem.model.Vehicle;

public class VehicleDAO {

    public static Vehicle[] vehicles = new Vehicle[Vehicle.MAX_VEHICLE_COUNT];;

    public static void insertVehicle(Vehicle vehicle){
        vehicles[vehicle.getTotalVehicle()-1] = vehicle;
    }

    public static Vehicle[] getAllVehicles() {
        return vehicles;
    }

    public Vehicle getVehicleById(int id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == id) {
                return vehicle;
            }
        }
        return null;
    }
}
