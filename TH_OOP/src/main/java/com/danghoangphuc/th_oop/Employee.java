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
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salaryMonthly;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getFullName(){
        return firstName + " " + lastName;
    }

    public int getSalaryMonthly() {
        return salaryMonthly;
    }
    
    public int getSalaryYearly(){
        return salaryMonthly * 12;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalaryMonthly(int salaryMonthly) {
        this.salaryMonthly = salaryMonthly;
    }
    
    public String showInfomation(){
        return "ID: " + id + "\n First Name: " + firstName + "\n Last Name: " + lastName + "\n Salary Monthly:" + salaryMonthly; 
    }
}
