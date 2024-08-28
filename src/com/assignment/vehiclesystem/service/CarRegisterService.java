package com.assignment.vehiclesystem.service;

import com.assignment.vehiclesystem.model.Car;
import com.assignment.vehiclesystem.model.Vehicle;

import java.io.IOException;

public class CarRegisterService extends VehicleRegisterService {

    public CarRegisterService() {
        super();
    }

    @Override
    public Vehicle registerInfo() throws IOException {
        Vehicle vh =  commonInfo();
        System.out.print("Enter Car Doors: ");
        String carDoors = br.readLine();
        Vehicle car = new  Car(vh, carDoors);
        vehicles[total] = car;
        total++;
        return car;
    }
}
