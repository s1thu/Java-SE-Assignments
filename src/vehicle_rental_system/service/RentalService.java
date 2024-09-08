package vehicle_rental_system.service;

import vehicle_rental_system.dao.CustomerDao;
import vehicle_rental_system.dao.RentalDao;
import vehicle_rental_system.model.Customer;
import vehicle_rental_system.model.Rental;
import vehicleregistrationsystem.dao.VehicleDAO;
import vehicleregistrationsystem.model.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class RentalService {

    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));

    private void rentInfo(){
        Vehicle[] vehicles = VehicleDAO.getAllVehicles();
        for(Vehicle vehicle: VehicleDAO.getAllVehicles()){
            if(vehicle != null) System.out.println(vehicle.toString());
        }

        Customer[] customers = CustomerDao.getAllCustomer();

        for(Customer customer: CustomerDao.getAllCustomer()){
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
        Rental Rental = new Rental(CustomerDao.getCustomerById(customerId), VehicleDAO.getVehicleById(vehicleId), days);
        RentalDao.insertRental(Rental);
    }

    public void createRental() throws IOException {
        rentInfo();
        userInput();
    }

    public Rental[] getAllRentals(){
        return RentalDao.getAllRentals();
    }

}
