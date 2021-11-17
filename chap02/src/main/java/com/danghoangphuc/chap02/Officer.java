/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danghoangphuc.chap02;
import java.time.Year;

/**
 *
 * @author phucp
 */
public class Officer {
    public String name;
    public String country;
    public int yob;
    public String gender;
    public String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getYob() {
        return yob;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }
    
    public String showInformation(){
        int year = Year.now().getValue();
        int age = year - yob;
        
        return "Name: " + name + "\nCountry: " + country + "\nAge: " + age + "\nGender: " + gender + "\n Address: " + address;
    }
    
}
