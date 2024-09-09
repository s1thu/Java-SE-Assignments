package vehicle_rental_system.dao;

import vehicle_rental_system.model.Customer;

public class CustomerDaoImpl extends CustomerDao {

    public static Customer[] customerDb = new Customer[100];
    static int customerCount = 0;

    static {
        System.out.println("CustomerDao static block");
        customerDb[customerCount++] = new Customer("SiSi", "No.22");
        customerDb[customerCount++] = new Customer("John Doe", "123 Main St");
        customerDb[customerCount++] = new Customer("Jane Doe", "456 Main St");
        customerDb[customerCount++] = new Customer("Alice Smith", "789 Main St");
        customerDb[customerCount++] = new Customer("Bob Johnson", "101 Main St");
        customerDb[customerCount++] = new Customer("Charlie Brown", "102 Main St");
        customerDb[customerCount++] = new Customer("David Wilson", "103 Main St");
        customerDb[customerCount++] = new Customer("Eve Davis", "104 Main St");
        customerDb[customerCount++] = new Customer("Frank Miller", "105 Main St");
        customerDb[customerCount++] = new Customer("Grace Lee", "106 Main St");
    }


    @Override
    public void insertCustomer(Customer customer) {
        customerDb[customer.getId() - 1] = customer;
    }

    @Override
    public Customer[] getAllCustomers() {
        return customerDb;
    }

    @Override
    public Customer getCustomerById(int id) {
        for (Customer customer : customerDb) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }
}
