package com.danghoangphuc.chap02;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author phucp
 */
public class Student {

    public String name;
    public String studentCode;
    public int birthday;

    public Student(String name, String studentCode, int birthday) {
        this.name = name;
        this.studentCode = studentCode;
        this.birthday = birthday;
    }

    public Student() {
        this.name = "KMA-301";
        this.studentCode = "KMA301-01";
        this.birthday = 2001;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentCode(String sc) {
        this.studentCode = sc;
    }

    public void setBirtday(int bd) {
        this.birthday = bd;
    }

    public String getName() {
        return name;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public int getBirthday() {
        return birthday;
    }

}
