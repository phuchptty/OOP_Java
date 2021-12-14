package com.danghoangphuc.book_manager;

import java.util.Scanner;

public class Main {
    private static void summonMenu() {
        System.out.println("1. Danh sách các sách");
        System.out.println("2. Thêm sách");
        System.out.println("3. Sửa sách");
        System.out.println("4. Xoá sách");
        System.out.println("5. Tìm sách");
        System.out.println("6. Thoát");
    }

    public static void main(String[] args) {
        Store store = new Store();
        int options;
        Scanner scanner = new Scanner(System.in);


        Book book1 = new Book(1, "sach 1", 10);
        Book book2 = new Book(2, "sach 2", 20);
        Book book3 = new Book(3, "sach 3", 15);
        Book book4 = new Book(4, "sach 4", 12);

        while (true) {
            summonMenu();
            options = scanner.nextInt();
            scanner.nextLine();

            switch (options) {
                case 6:
                    return;
                case 1:
                    store.list();
                    break;
                case 2:
                    store.add(book1);
                    store.add(book2);
                    store.add(book3);
                    store.add(book4);
                    break;
                case 3:
                    store.edit();
                    break;
                case 4:
                    store.delete();
                    break;
                case 5:
                    store.find();
                    break;
            }
        }
    }
}
