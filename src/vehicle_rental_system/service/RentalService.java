package vehicle_rental_system.service;

import vehicle_rental_system.dao.CustomerDaoImpl;
import vehicle_rental_system.dao.RentalDaoImpl;
import vehicle_rental_system.model.Customer;
import vehicle_rental_system.model.Rental;
import vehicleregistrationsystem.dao.VehicleDaoImpl;
import vehicleregistrationsystem.model.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RentalService {

    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    VehicleDaoImpl vehicleDao = new VehicleDaoImpl();
    CustomerDaoImpl customerdaoimpl = new CustomerDaoImpl();
    RentalDaoImpl rentaldaoimpl = new RentalDaoImpl();

    private void rentInfo(){
        for(Vehicle vehicle: vehicleDao.getAllVehicles()){
            if(vehicle != null) System.out.println(vehicle.toString());
        }
        for(Customer customer: customerdaoimpl.getAllCustomers()){
            if(customer != null)
                System.out.println(customer.toString());

        }
    }

    private void userInput() throws IOException {
        System.out.print("Please Enter Customer ID :");
        int customerId = Integer.parseInt(br.readLine());

        System.out.print("Please Enter Vehicle ID :");
        int vehicleId = Integer.parseInt(br.readLine());

        System.out.print("Please Enter Number of Days :");
        int days = Integer.parseInt(br.readLine());
        Rental Rental = new Rental(customerdaoimpl.getCustomerById(customerId), vehicleDao.getVehicleById(vehicleId), days);
        rentaldaoimpl.insertRental(Rental);
    }

    public void createRental() throws IOException {
        rentInfo();
        userInput();
    }

    public Rental[] getAllRentals(){
        return rentaldaoimpl.getAllRentals();
    }

}
