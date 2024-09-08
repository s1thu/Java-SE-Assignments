package vehicle_rental_system.dao;

import vehicle_rental_system.model.Customer;

public class CustomerDao {

    public static Customer[] customerDb = new Customer[100];

    static {
        System.out.println("CustomerDao static block");
        insertCustomer(new Customer("John Doe", "123 Main St"));
        insertCustomer(new Customer("Jane Doe", "456 Main St"));
        insertCustomer(new Customer("Alice Smith", "789 Main St"));
        insertCustomer(new Customer("Bob Johnson", "101 Main St"));
        insertCustomer(new Customer("Charlie Brown", "102 Main St"));
        insertCustomer(new Customer("David Wilson", "103 Main St"));
        insertCustomer(new Customer("Eve Davis", "104 Main St"));
        insertCustomer(new Customer("Frank Miller", "105 Main St"));
        insertCustomer(new Customer("Grace Lee", "106 Main St"));
        insertCustomer(new Customer("Hank Green", "107 Main St"));
        System.out.println("CustomerDao static block end");
    }

    public static void insertCustomer(Customer customer){
        customerDb[customer.getCustomerCount() - 1] = customer;
    }

    public static Customer[] getAllCustomer(){
        return customerDb;
    }

    public static Customer getCustomerById(int id){
        for (Customer customer : customerDb) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

}
