/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danghoangphuc.th_oop;

import java.util.Scanner;

/**
 *
 * @author phucp
 */
public class NhanVien {
    private String name;
    private int age;
    private String address;
    private double salary;
    private int workHour;

    public NhanVien() {
    }

    public NhanVien(String name, int age, String address, double salary, int workHour) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.workHour = workHour;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public int getWorkHour() {
        return workHour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }
    
    public void inputInfo(){
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        age = input.nextInt();
        address = input.nextLine();
        salary = input.nextDouble();
        workHour = input.nextInt();
    }
    
    public void printInfo() {
        System.out.println("Ho ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Dia Chi: " + address);
        System.out.println("Luong: " + salary);
        System.out.println("Tong gio lam: " + workHour);
    }
    
    public double tinhThuong(){
        return workHour >= 200 ? salary * 0.2 : (workHour < 200 && workHour >= 100) ? salary * 0.1 : 0;
    }
}
