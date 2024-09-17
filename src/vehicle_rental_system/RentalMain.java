package vehicle_rental_system;

import vehicle_rental_system.model.Customer;
import vehicle_rental_system.model.Rental;
import vehicle_rental_system.service.CustomerService;
import vehicle_rental_system.service.RentalService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class RentalMain {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException, SQLException {
        String flag = "";

        do{
            System.out.println("Please choose type of service");
            System.out.println("1. Customer Registration Service");
            System.out.println("2. Rental Service");
            System.out.println("Select Choice :");

            switch (Integer.parseInt(br.readLine())){
                case 1:
                    CustomerService customerService = new CustomerService();
                    customerService.registerInfo();
                    break;
                case 2:
                    RentalService rentalService = new RentalService();
                    rentalService.createRental();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            System.out.println("Do you want to choose other service?(yes/no)");
            flag = br.readLine();
        }while (!flag.equals("no"));

        CustomerService customerService = new CustomerService();
        for(Customer customer : customerService.getAllCustomer()){
            if(customer != null){
                System.out.println(customer);
                customer.toString();
                System.out.println();
            }
        }

        RentalService rentalService = new RentalService();
        for(Rental rental :rentalService.getAllRentals()){
            if(rental != null){
                System.out.println(rental);
                rental.toString();
                System.out.println();
            }
        }

        System.out.println("Total Customer :" + Customer.getCustomerCount());
        System.out.println("Total Rental :" + Rental.getTotalRental());
    }
}
