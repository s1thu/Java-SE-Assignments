package com.assignment.vehiclesystem.service;

import com.assignment.vehiclesystem.dao.VehicleDao;
import com.assignment.vehiclesystem.model.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VehicleRegisterService {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Vehicle vh;
    static Vehicle[] vehicles;

    VehicleDao vehicleDao = new VehicleDao();

    public VehicleRegisterService() {
        vehicles = vehicleDao.getAllVehicles();
    }

    public Vehicle getVh() {
        return vh;
    }

    public void setVh(Vehicle vh) {
        this.vh = vh;
    }

    public void commonInfo() throws IOException{
        System.out.print("Enter Model: ");
        String model = br.readLine();
        System.out.print("Enter Brand: ");
        String brand = br.readLine();
        vh = new Vehicle(model, brand,true);
    }

    public void create() throws IOException {
        commonInfo();
        vehicleDao.insertVehicle(registerInfo());
    }

    public Vehicle registerInfo() throws IOException {
        return null;
    }

    public static void main(String[] args) throws IOException {
        String flag = "";
        Vehicle vh = null;
        do{
            System.out.println("Enter Vehicle Type(1.Car/2.Truck/3.Motorcycle): ");
            int type = Integer.parseInt(br.readLine());
            VehicleRegisterService vehicleRegisterService = null;
            switch (type){
                case 1:
                    vehicleRegisterService = new CarRegisterService();
                    break;
                case 2:
                    vehicleRegisterService = new TruckRegisterService();
                    break;
                case 3:
                    vehicleRegisterService = new MotorcycleRegisterService();
                    break;
            }
            vehicleRegisterService.create();

            System.out.println("Do you want to add another vechicle?(yes/no)");
            flag = br.readLine();
        }while (flag.equalsIgnoreCase("yes"));


        for (Vehicle vehicle : vehicles) {
            if (vehicle != null) {
                vehicle.displayInfo();
                System.out.println("===================================");
            }
        }
        System.out.println("Total Vehicles: " + vh.getTotal());
    }
}
