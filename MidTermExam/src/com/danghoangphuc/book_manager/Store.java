package com.danghoangphuc.book_manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Store {
    private int totalItems = 0;
    private static final int MAX_ITEMS = 1000;
    private Book[] listItems = new Book[MAX_ITEMS];

    public void add(Book book) {
        if (totalItems + 1 > MAX_ITEMS) {
            System.out.println("Kho da dat gioi han!");
            return;
        }

        listItems[totalItems++] = book;
    }

    private int findIndex(String name) {
        for (int i = 0; i < totalItems; i++) {
            if (listItems[i].getName().toLowerCase().equals(name.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

    public void edit() {
        System.out.println("Nhập tên sách bạn muốn sửa: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int index = findIndex(name);

        if (index == -1) {
            System.out.println("Sach khong ton tai!");
        } else {
            Book newBook = new Book();
            newBook.input();
            listItems[index] = newBook;
        }
    }

    public void delete() {
        System.out.println("Nhập tên sách bạn muốn xoá: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int index = findIndex(name);

        if (index == -1) {
            System.out.println("Sach khong ton tai!");
        } else {
            ArrayList<Book> arrayListBook = new ArrayList<Book>();
            Collections.addAll(arrayListBook, listItems);

            arrayListBook.remove(index);
            listItems = arrayListBook.toArray(new Book[MAX_ITEMS]);
        }
    }

    public void find() {
        System.out.println("Nhập tên sách bạn muốn tìm: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int index = findIndex(name);

        if (index == -1) {
            System.out.println("Sach khong ton tai!");
        } else {
            System.out.println(listItems[index].toString());
        }
    }

    public void list() {
        for (int i = 0; i < totalItems; i++) {
            System.out.println(listItems[i].toString());
        }
    }
}
