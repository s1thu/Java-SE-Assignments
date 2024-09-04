package com.factorypattern.service;

import com.factorypattern.model.Vehicle;
import com.factorypattern.utl.Reader;

public class VehicleInquiryService implements VehicleInquiry {

    public Vehicle getVehicleInfo() {

        System.out.print("Pleas Enter model:");
        String model = Reader.getBufferReader().readLine();

        System.out.print("Pleas Enter brand:");
        String brand = Reader.getBufferReader().readLine();

        return new Vehicle(model, brand);
    }
}
