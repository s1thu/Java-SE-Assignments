package vehicleregistrationsystem.service;

import vehicleregistrationsystem.model.Truck;
import vehicleregistrationsystem.model.Vehicle;

import java.io.IOException;

public class TruckRegisterService extends VehicleRegisterService {

    @Override
    public Vehicle registerInfo() throws IOException {
        System.out.print("Enter payload capacity: ");
        int payloadCapacity = Integer.parseInt(br.readLine());
        return new Truck(getVehicle().getModel(), getVehicle().getBrand(), payloadCapacity);
    }
}
