package vehicle_rental_system.service;

import vehicle_rental_system.dao.CustomerDao;
import vehicle_rental_system.model.Customer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomerService {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void registerCustomer(Customer customer){
        CustomerDao.insertCustomer(customer);
    }

    public Customer[] getAllCustomer(){
        return CustomerDao.getAllCustomer();
    }

    public void registerInfo() throws IOException {
        System.out.println("Please Enter Customer Name :");
        String name = br.readLine();

        System.out.println("Please Enter Customer Address :");
        String address = br.readLine();

        Customer customer = new Customer(name, address);
        registerCustomer(customer);
    }

}
