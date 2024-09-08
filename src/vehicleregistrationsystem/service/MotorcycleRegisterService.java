package vehicleregistrationsystem.service;

import vehicleregistrationsystem.model.Motorcycle;
import vehicleregistrationsystem.model.Vehicle;

import java.io.IOException;

public class MotorcycleRegisterService extends VehicleRegisterService{

    @Override
    public Vehicle registerInfo() throws IOException {
        System.out.print("Does the motorcycle have a side car? (yes/no): ");
        boolean hasSideCar = br.readLine().equalsIgnoreCase("yes");
        return new Motorcycle(getVehicle().getModel(), getVehicle().getBrand(), hasSideCar);
    }
}
