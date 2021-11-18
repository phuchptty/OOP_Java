/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danghoangphuc.th_oop;

import java.util.Scanner;

/**
 * @author phucp
 */
public class Student extends Person{
    private String studentCode;

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    //    private double diemTB;
//    private int tuoi;
//    private String lop;
//
//    public String getMaSV() {
//        return maSV;
//    }
//
//    public double getDiemTB() {
//        return diemTB;
//    }
//
//    public int getTuoi() {
//        return tuoi;
//    }
//
//    public String getLop() {
//        return lop;
//    }
//
//    public void setMaSV(String maSV) {
//        if (maSV.length() <= 8) {
//            this.maSV = maSV;
//        } else {
//            System.out.println("Ma SV chứa tôi đa 8 ký tự");
//        }
//    }
//
//    public void setDiemTB(double diemTB) {
//        if (diemTB >= 0 && diemTB <= 10.0) {
//            this.diemTB = diemTB;
//        } else {
//            System.out.println("DiemTB phải trong khoảng 0 -> 10.0");
//        }
//    }
//
//    public void setTuoi(int tuoi) {
//        if (tuoi >= 18) {
//            this.tuoi = tuoi;
//        } else {
//            System.out.println("Tuổi phải >= 18");
//        }
//    }
//
//    public void setLop(String lop) {
//        if (lop.startsWith("A") || lop.startsWith("C")) {
//            this.lop = lop;
//        } else {
//            System.out.println("Lớp phải bắt đầu bằng A hoặc C");
//        }
//    }
//
//    public Student() {
//    }
//
//    public Student(String maSV, double diemTB, int tuoi, String lop) {
//        this.setMaSV(maSV);
//        this.setDiemTB(diemTB);
//        this.setTuoi(tuoi);
//        this.setLop(lop);
//    }
//
//    public void inputInfo() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap ma sinh vien : ");
//        this.setMaSV(sc.nextLine());
//
//        System.out.println("Nhap diem trung binh : ");
//        this.setDiemTB(sc.nextDouble());
//
//        System.out.println("Nhap tuoi : ");
//        this.setTuoi(sc.nextInt());
//
//        System.out.println("Nhap lop : ");
//        this.setLop(sc.nextLine());
//    }
//
//    public void showInfo() {
//        System.out.println("MSV : " + maSV + ", diem trung binh : " + diemTB + ", tuoi : " + tuoi + ", grade : " + lop);
//    }
//
//    public void checkHocBong(){
//        if (diemTB >= 8.0){
//            System.out.println("Được học bổng");
//        } else {
//            System.out.println("Không được học bổng");
//        }
//    }
}
