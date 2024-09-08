package vehicle_rental_system.service;

import vehicle_rental_system.dao.CustomerDao;
import vehicle_rental_system.model.Customer;
import vehicleregistrationsystem.dao.VehicleDAO;
import vehicleregistrationsystem.model.Vehicle;

public class RentalService {


    private void rentInfo(){
        Vehicle[] vehicles = VehicleDAO.getAllVehicles();
        if(vehicles.length > 0){
            for(Vehicle vehicle: VehicleDAO.getAllVehicles()){
                if(vehicle != null){
                    vehicle.toString();
                }
            }
        }else{
            System.out.print("There are no Vehicles to Rent!");
        }
        Customer[] customers = CustomerDao.getAllCustomer();
        if(customers.length > 0){
            for(Customer customer: CustomerDao.getAllCustomer()){
                if(customer != null){
                    customer.toString();
                }
            }
        }else{
            System.out.print("There are no Customers to Rent!");
        }

    }

    public void userInput(){
        System.out.print("Please Enter Customer ID");
    }

}
