package com.salary_mng_sys.model;

public class FullTimeEmployee extends Employee{

    private double allowance;
    private double bonus;

    public FullTimeEmployee(String name, int employeeId, double basicSalary, double allowance, double bonus) {
        super(name, employeeId, basicSalary);
        this.allowance = allowance;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + allowance + bonus;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Total Salary:" + this.calculateSalary());
    }
}
