package com.danghoangphuc.th_oop;

public class Manager extends Employee {
    private double salaryResponsibility;

    public double getSalaryResponsibility() {
        return salaryResponsibility;
    }

    public void setSalaryResponsibility(double salaryResponsibility) {
        this.salaryResponsibility = salaryResponsibility;
    }

    public double salary() {
        return (getBasicSalary() * getSalaryMultiplier()) + salaryResponsibility;
    }
}
