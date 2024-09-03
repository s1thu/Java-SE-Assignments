package com.assignment.vehiclesystem.service;

import com.assignment.vehiclesystem.model.Car;
import com.assignment.vehiclesystem.model.Vehicle;

import java.io.IOException;

public class CarRegisterService extends VehicleRegisterService {

    public CarRegisterService() {
        super();
    }

    @Override
    public void registerInfo() throws IOException {
        System.out.print("Enter Number of Doors: ");
        String doors = br.readLine();
        Vehicle car = new Car(getVh(), doors);
        vehicles[vh.getTotal()] = car;
    }
}
