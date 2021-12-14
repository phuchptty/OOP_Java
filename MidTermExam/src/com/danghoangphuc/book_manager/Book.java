package com.danghoangphuc.book_manager;

import java.util.Scanner;

public class Book {
    private int ID;
    private String name;
    private double price;

    public Book() {
    }

    public Book(int ID, String name, double price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ten sach: ");
        name = scanner.nextLine();
        System.out.println("Nhap gia sach: ");
        price = scanner.nextDouble();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Book{" + "ID=" + ID + ", name='" + name + '\'' + ", price=" + price + "}";
    }

}
