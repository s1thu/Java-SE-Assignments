package com.assignment.vehiclesystem.service;

import com.assignment.vehiclesystem.model.Car;
import com.assignment.vehiclesystem.model.Motorcycle;
import com.assignment.vehiclesystem.model.Truck;
import com.assignment.vehiclesystem.model.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VehicleRegisterService {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Vehicle[] vehicles = new Vehicle[100];

    public static Vehicle commonInfo() throws IOException{
        System.out.print("Enter Model: ");
        String model = br.readLine();
        System.out.print("Enter Brand: ");
        String brand = br.readLine();
        return new Vehicle(model, brand);
    }

    public static Vehicle inputUserInfo() throws IOException {
        System.out.println("Register Vehicle => 1. Car 2. Truck 3. Motorcycle");
        int choice = Integer.parseInt(br.readLine());
        Vehicle vh = commonInfo();
        switch (choice){
            case 1:
                System.out.print("Enter Car Doors: ");
                String carDoors = br.readLine();
                return new Car(vh, carDoors);
            case 2:
                System.out.print("Enter PayloadCapacity: ");
                String payload = br.readLine();
                return new Truck(vh, payload);
            case 3:
                System.out.print("Enter Sidecar: ");
                String sidecar = br.readLine();
                boolean hasSidecar = sidecar.equalsIgnoreCase("yes");
                return new Motorcycle(vh, hasSidecar);
        }

        return null;
    }
    public static void main(String[] args) throws IOException {
        String flag = "";
        Vehicle vh;
        int total = 0;
        do{
             vh = inputUserInfo();
             vehicles[total] = vh;
             total++;
            System.out.println("Do you want to add another vechicle?(yes/no)");
            flag = br.readLine();
        }while (flag.equalsIgnoreCase("yes"));


        for (Vehicle vehicle : vehicles) {
            if (vehicle != null) {
                vehicle.displayInfo();
                System.out.println("===================================");
            }
        }
        System.out.println("Total Vehicles: " + total);
    }
}
