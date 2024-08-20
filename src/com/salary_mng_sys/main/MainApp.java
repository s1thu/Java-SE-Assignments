package com.salary_mng_sys.main;
import com.salary_mng_sys.model.*;

public class MainApp {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John Doe", 101, 50000, 20000, 0);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Jane Smith", 102, 100, 120);
        ContractEmployee contractEmployee = new ContractEmployee("Mark Johnson", 103, 6, 30000);

        fullTimeEmployee.displayDetails();
        System.out.println();
        partTimeEmployee.displayDetails();
        System.out.println();
        contractEmployee.displayDetails();
        System.out.println();
    }
}
