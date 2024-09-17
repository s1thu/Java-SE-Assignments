package vehicle_rental_system.dao;

import vehicle_rental_system.model.Customer;
import vehicle_rental_system.persistence.PgSqlFactory;
import vehicleregistrationsystem.persistence.PgsqlFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDaoImpl extends CustomerDao {

    private Connection connection;

    public CustomerDaoImpl() {
        connection = PgSqlFactory.getConnection();
    }
//    public static Customer[] customerDb = new Customer[100];
//    static int customerCount = 0;
//
//    static {
//        System.out.println("CustomerDao static block");
//        customerDb[customerCount++] = new Customer("SiSi", "No.22");
//        customerDb[customerCount++] = new Customer("John Doe", "123 Main St");
//        customerDb[customerCount++] = new Customer("Jane Doe", "456 Main St");
//        customerDb[customerCount++] = new Customer("Alice Smith", "789 Main St");
//        customerDb[customerCount++] = new Customer("Bob Johnson", "101 Main St");
//        customerDb[customerCount++] = new Customer("Charlie Brown", "102 Main St");
//        customerDb[customerCount++] = new Customer("David Wilson", "103 Main St");
//        customerDb[customerCount++] = new Customer("Eve Davis", "104 Main St");
//        customerDb[customerCount++] = new Customer("Frank Miller", "105 Main St");
//        customerDb[customerCount++] = new Customer("Grace Lee", "106 Main St");
//    }


    @Override
    public void insertCustomer(Customer customer) throws SQLException {
        String sql = "INSERT INTO customer (id, name, address) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, customer.getId());
        preparedStatement.setString(2, customer.getName());
        preparedStatement.setString(3, customer.getAddress());
        preparedStatement.executeUpdate();
    }

    @Override
    public Customer[] getAllCustomers() {
        return null;
    }

    @Override
    public Customer getCustomerById(int id) {
        return null;
    }
}
