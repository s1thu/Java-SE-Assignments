package vehicleregistrationsystem;

import vehicleregistrationsystem.dao.VehicleDAO;
import vehicleregistrationsystem.model.Vehicle;
import vehicleregistrationsystem.service.CarRegisterService;
import vehicleregistrationsystem.service.MotorcycleRegisterService;
import vehicleregistrationsystem.service.TruckRegisterService;
import vehicleregistrationsystem.service.VehicleRegisterService;

import java.io.IOException;

public class main {

    public static VehicleRegisterService vehicleRegisterService = new VehicleRegisterService();
    public static void chooseVehicleService() throws IOException {

        String flag = "";
        do{
            System.out.println("1. Car");
            System.out.println("2. Motorcycle");
            System.out.println("3. Truck");
            System.out.print("Enter your choice: ");
            int vehicleChoice = Integer.parseInt(vehicleRegisterService.br.readLine());
            switch (vehicleChoice){
                case 1:
                    vehicleRegisterService = new CarRegisterService();
                    break;
                case 2:
                    vehicleRegisterService = new MotorcycleRegisterService();
                    break;
                case 3:
                    vehicleRegisterService = new TruckRegisterService();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            vehicleRegisterService.createVehicle();
            System.out.print("Do you want to add another vehicle?(yes/no)");
            flag = vehicleRegisterService.br.readLine();
        }while (!flag.equals("no"));
    }
    public static void main(String[] args) throws IOException {

        chooseVehicleService();
        for (Vehicle vehicle : vehicleRegisterService.getAllVehicles()) {
            if(vehicle != null){
                vehicle.displayInfo();
                System.out.println();
            }
        }
        System.out.print("Total Number of Vehicle :" + Vehicle.getTotalVehicle());
    }
}
