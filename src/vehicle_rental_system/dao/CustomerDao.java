package vehicle_rental_system.dao;

import vehicle_rental_system.model.Customer;

import java.sql.SQLException;

public abstract class CustomerDao {
    public abstract void insertCustomer(Customer customer) throws SQLException;
    public abstract Customer[] getAllCustomers();
    public abstract Customer getCustomerById(int id);
}
