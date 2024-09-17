package vehicleregistrationsystem.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PgsqlFactory {

    private String url = "jdbc:postgresql://localhost:5432/vehicle_registration_system";
    private String user = "postgres";
    private String password = "root";
    private static Connection connection;

    public PgsqlFactory() throws SQLException {
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established successfully.");
        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
            throw e;
        }
    }

    public static Connection getConnection() {
        return connection;
    }

}
