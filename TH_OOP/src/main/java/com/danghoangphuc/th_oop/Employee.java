/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danghoangphuc.th_oop;

/**
 *
 * @author phucp
 */
public class Employee extends Person {
    private double basicSalary;
    private double salaryMultiplier;

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getSalaryMultiplier() {
        return salaryMultiplier;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setSalaryMultiplier(double salaryMultiplier) {
        this.salaryMultiplier = salaryMultiplier;
    }

    public double salary() {
        return basicSalary * salaryMultiplier;
    }
}
