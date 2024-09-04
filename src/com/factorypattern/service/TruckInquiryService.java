package com.factorypattern.service;

import com.factorypattern.model.Vehicle;
import com.factorypattern.utl.Reader;

public class TruckInquiryService extends VehicleInquiryService {

    public Vehicle getVehicleInfo() {
        super.getVehicleInfo();

        System.out.print("Pleas Enter weight:");
        String weight = Reader.getBufferReader().readLine();

        return new Vehicle(model, brand, weight);
    }
}

