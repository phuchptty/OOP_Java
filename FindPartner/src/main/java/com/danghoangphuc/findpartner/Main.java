/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danghoangphuc.findpartner;

import java.util.Scanner;

/**
 *
 * @author phucp
 */
public class Main {

    public static void main(String args[]) {
        int partnerNumber = (int) (Math.random() * 80 + 1);
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            choice = sc.nextInt();

            if (choice < partnerNumber) {
                System.out.println("Ban dang thap hon");
            } else if (choice > partnerNumber) {
                System.out.println("Bang dang cao hon");
            } else {
                System.out.println("Chinh xac");
                break;
            }
        }
    }
}
