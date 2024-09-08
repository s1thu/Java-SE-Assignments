package vehicle_rental_system.dao;

import vehicle_rental_system.model.Customer;

public class CustomerDao {

    public static Customer[] customerDb = new Customer[100];

    public static void insertCustomer(Customer customer){
        customerDb[customer.getCustomerCount() - 1] = customer;
    }

    public static Customer[] getAllCustomer(){
        return customerDb;
    }

}
