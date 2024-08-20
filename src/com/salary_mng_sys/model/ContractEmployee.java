package com.salary_mng_sys.model;

public class ContractEmployee extends Employee{

    private int contractDuration;
    private double contractAmount;

    public ContractEmployee(String name, int employeeId, int contractDuration, double contractAmount) {
        super(name, employeeId, 0);
        this.contractDuration = contractDuration;
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateSalary() {
        return contractAmount / contractDuration;

    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Total Salary:" + calculateSalary());
    }
}
