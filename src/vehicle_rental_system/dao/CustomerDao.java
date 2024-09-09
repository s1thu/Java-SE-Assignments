package vehicle_rental_system.dao;

import vehicle_rental_system.model.Customer;

public abstract class CustomerDao {
    public abstract void insertCustomer(Customer customer);
    public abstract Customer[] getAllCustomers();
    public abstract Customer getCustomerById(int id);
}
