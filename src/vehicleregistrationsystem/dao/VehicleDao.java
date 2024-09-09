package vehicleregistrationsystem.dao;

import vehicleregistrationsystem.model.Vehicle;

public abstract class VehicleDao {

    public abstract void insertVehicle(Vehicle vehicle);
    public abstract Vehicle[] getAllVehicles();
    public abstract Vehicle getVehicleById(int id);
}
