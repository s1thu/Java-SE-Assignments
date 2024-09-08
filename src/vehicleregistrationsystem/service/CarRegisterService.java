package vehicleregistrationsystem.service;

import vehicleregistrationsystem.model.Car;
import vehicleregistrationsystem.model.Vehicle;

import java.io.IOException;

public class CarRegisterService extends VehicleRegisterService{

    @Override
    public Vehicle registerInfo() throws IOException {
        System.out.print("Enter number of doors: ");
        int numberOfDoors = Integer.parseInt(br.readLine());

        return new Car(getVehicle().getModel(), getVehicle().getBrand(), numberOfDoors);
    }
}
