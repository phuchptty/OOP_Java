package TH3;

import java.util.Scanner;

public class Nguoi {
    private String name;
    private String address;
    private int dateOfBirth;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        address = scanner.nextLine();
        System.out.println("Nhap nam sinh: ");
        dateOfBirth = scanner.nextInt();
        scanner.nextLine();
    }

    public void output() {
        System.out.println("Name='" + name + ", address='" + address + ", dateOfBirth=" + dateOfBirth);
    }
}
