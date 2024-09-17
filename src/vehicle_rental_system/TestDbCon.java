package vehicle_rental_system;

import vehicle_rental_system.persistence.PgSqlFactory;

import java.sql.Connection;

public class TestDbCon {
    public static void main(String[] args) {
        Connection con = PgSqlFactory.getConnection();
        if(con != null){
            System.out.println("Connection established successfully.");
        } else {
            System.out.println("Connection failed.");
        }
    }
}
