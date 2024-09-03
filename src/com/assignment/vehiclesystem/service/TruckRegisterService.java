package com.assignment.vehiclesystem.service;

import com.assignment.vehiclesystem.model.Truck;
import com.assignment.vehiclesystem.model.Vehicle;

import java.io.IOException;

public class TruckRegisterService extends VehicleRegisterService{

        public TruckRegisterService() {
            super();
        }

    @Override
    public void registerInfo() throws IOException {
        System.out.print("Enter Payload Capacity: ");
        String capacity = br.readLine();
        Vehicle truck = new Truck(getVh(), capacity);
        vehicles[vh.getTotal()] = truck;
    }
}
