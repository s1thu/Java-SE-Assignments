package com.assignment.vehiclesystem.service;

import com.assignment.vehiclesystem.model.Motorcycle;
import com.assignment.vehiclesystem.model.Vehicle;

import java.io.IOException;

public class MotorcycleRegisterService extends VehicleRegisterService{

        public MotorcycleRegisterService() {
            super();
        }

    @Override
    public void registerInfo() throws IOException {
        System.out.print("Enter Sidecar (Yes/No): ");
        String sidecar = br.readLine();
        Vehicle motorcycle = new Motorcycle(getVh(), sidecar.equalsIgnoreCase("yes"));
        vehicles[vh.getTotal()] = motorcycle;
    }
}
