package TH2;

import java.util.Scanner;

public class B4 {
    private int n;
    private Scanner sn = new Scanner(System.in);

    public void insert() {
        System.out.print("Nhập n: ");
        this.n = sn.nextInt();
    }

    public boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }

        int squareRoot = (int) Math.sqrt(n);

        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void useFor() {
        System.out.printf("Tất cả các số nguyên tố nhỏ hơn " + n + " là: ");

        if (n >= 2) {
            System.out.print(2);
        }

        for (int i = 3; i < n; i += 2) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }

    public void useWhile() {
        System.out.printf("Tất cả các số nguyên tố nhỏ hơn " + n + " là: ");

        if (n >= 2) {
            System.out.print(2);
        }

        int i = 3;
        while (i < n) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }

            i += 2;
        }
    }

    public void useDoWhile() {
        System.out.printf("Tất cả các số nguyên tố nhỏ hơn " + n + " là: ");

        if (n >= 2) {
            System.out.print(2);
        }

        int i = 3;
        do {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }

            i += 2;
        } while (i < n);
    }

    public static void main(String[] args) {
        B4 b4 = new B4();
        b4.insert();
//        b4.useFor();
        b4.useDoWhile();
    }
}
