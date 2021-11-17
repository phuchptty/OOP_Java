/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danghoangphuc.chap02;

/**
 *
 * @author phucp
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Hello world");
        
        Student firstStudent = new Student();
        
        firstStudent.setName("Phuc");
        firstStudent.setStudentCode("AT160340");
        firstStudent.setBirtday(2001);
        
        System.out.println("First Student");
        System.out.println("Name: " + firstStudent.name);
        System.out.println("Student Code: " + firstStudent.studentCode);
        System.out.println("Birthday: " + firstStudent.birthday);
        
        System.out.println("\n");
        
        Cat cat = new Cat();
        cat.setName("ABC");
        cat.setAge(1);
        cat.setCountry("Vietnam");

        System.out.println(cat.showInfomation());
        
        System.out.println("\n");
        
        Officer officer = new Officer();
        officer.setName("Phuc");
        officer.setGender("Nan");
        officer.setAddress("Ha Noi");
        officer.setCountry("Vietnam");
        officer.setYob(2001);
        
        System.out.println(officer.showInformation());
        
    }
}
