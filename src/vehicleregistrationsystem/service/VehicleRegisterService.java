package vehicleregistrationsystem.service;

import vehicleregistrationsystem.dao.VehicleDAO;
import vehicleregistrationsystem.model.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class VehicleRegisterService {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    private void commonInfo() throws IOException {
        System.out.print("Enter the model: ");
        String model = br.readLine();

        System.out.print("Enter the brand: ");
        String brand = br.readLine();

       vehicle = new Vehicle(model, brand,false);
    }

    public void createVehicle() throws IOException {
        commonInfo();
        VehicleDAO.insertVehicle(registerInfo());
    }

    public Vehicle[] getAllVehicles(){
        return VehicleDAO.getAllVehicles();
    }

    public Vehicle registerInfo() throws IOException {return null;}

}
