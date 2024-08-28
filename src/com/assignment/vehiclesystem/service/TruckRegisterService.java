package com.assignment.vehiclesystem.service;

import com.assignment.vehiclesystem.model.Truck;
import com.assignment.vehiclesystem.model.Vehicle;

import java.io.IOException;

public class TruckRegisterService extends VehicleRegisterService{

        public TruckRegisterService() {
            super();
        }

        @Override
        public Vehicle registerInfo() throws IOException {
            Vehicle vh =  commonInfo();
            System.out.print("Enter Truck Capacity: ");
            String truckCapacity = br.readLine();
            Vehicle truck = new Truck(vh, truckCapacity);
            vehicles[total] = truck;
            total++;
            return truck;
        }
}
