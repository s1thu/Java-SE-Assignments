package vehicleregistrationsystem.dao;

import vehicle_rental_system.model.Customer;
import vehicleregistrationsystem.model.Car;
import vehicleregistrationsystem.model.Vehicle;

public class VehicleDaoImpl extends VehicleDao {

    public static Vehicle[] vehicleDb = new Vehicle[Vehicle.MAX_VEHICLE_COUNT];;
    static int vehicleCount = 0;

    static {
        System.out.println("VehicleDAO static block");
        vehicleDb[vehicleCount++] = new Car("Honda", "honda", 4);
        vehicleDb[vehicleCount++] = new Car("Toyota", "toyota", 4);
        vehicleDb[vehicleCount++] = new Car("Ford", "ford", 4);
        vehicleDb[vehicleCount++] = new Car("Chevrolet", "chevrolet", 4);
        vehicleDb[vehicleCount++] = new Car("BMW", "bmw", 4);
        vehicleDb[vehicleCount++] = new Car("Audi", "audi", 4);
        vehicleDb[vehicleCount++] = new Car("Mercedes", "mercedes", 4);
        vehicleDb[vehicleCount++] = new Car("Volkswagen", "volkswagen", 4);
        vehicleDb[vehicleCount++] = new Car("Nissan", "nissan", 4);
        vehicleDb[vehicleCount++] = new Car("Hyundai", "hyundai", 4);
    }

    @Override
    public void insertVehicle(Vehicle vehicle) {
        vehicleDb[vehicle.getTotalVehicle()-1] = vehicle;
    }

    @Override
    public Vehicle[] getAllVehicles() {
        return vehicleDb;
    }

    @Override
    public Vehicle getVehicleById(int id) {
        for (Vehicle vehicle: vehicleDb) {
            if (vehicle.getId() == id) {
                return vehicle;
            }
        }
        return null;
    }


}
