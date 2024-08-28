package com.assignment.vehiclesystem.service;

import com.assignment.vehiclesystem.model.Motorcycle;
import com.assignment.vehiclesystem.model.Vehicle;

import java.io.IOException;

public class MotorcycleRegisterService extends VehicleRegisterService{

        public MotorcycleRegisterService() {
            super();
        }

        @Override
        public Vehicle registerInfo() throws IOException {
            Vehicle vh =  commonInfo();
            System.out.print("Has Side car(yes/no): ");
            boolean hasSidecar = br.readLine().equalsIgnoreCase("yes");
            Vehicle motorcycle = new  Motorcycle(vh, hasSidecar);
            vehicles[total] = motorcycle;
            total++;
            return motorcycle;
        }
}
