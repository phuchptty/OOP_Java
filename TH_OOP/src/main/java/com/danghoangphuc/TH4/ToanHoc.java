package com.danghoangphuc.TH4;

public class ToanHoc {
    public static boolean kiemtraNguyenTo(int k) {
        if (k < 2) {
            return false;
        }

        int squareRoot = (int) Math.sqrt(k);

        for (int i = 2; i <= squareRoot; i++) {
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean kiemtraHoanHao(int n) {
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                sum += i;
        }

        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean kiemtraSoChinhPhuong(int n) {
        double sq = Math.sqrt(n);
        return ((sq - Math.floor(sq)) == 0);
    }

    public static int tinhFibo(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        int rs = 0;

        if (n == 0) {
            rs = 0;
        } else if (n == 1) {
            rs = 1;
        } else if (n > 1) {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
            rs = fn;
        }

        return rs;
    }

    public static double tinhTongC5(int n) {
        double sum = 0;

        for (double i = 2; i <= n; i++) {
            sum += (i - 1) / i;
        }

        return sum;
    }

    public static double tinhTongC6(int n) {
        double tu = 1, mau, sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                mau = (double) (Math.pow(n, i) + Math.pow(n, i));
            } else {
                mau = (double) (Math.pow(n, i) - Math.pow(n, i));
            }
            tu *= i;
            sum += ((double) tu / mau);
        }
        return sum;
    }

    public static double tinhTongC8(int n) {
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            long factorial = 1;

            if (n == 0 || n == 1) {
                sum += factorial;
            } else {
                for (int j = 2; j <= n; j++) {
                    factorial *= j;
                }
                sum += factorial;
            }
        }

        return sum;
    }

    public static double tinhTongC7(int n) {
        double sum = 1;
        int lastNumber = (int) (Math.pow(1, n) * 1 * n);

        for (int i = 2; i <= lastNumber; i++) {
            if (i % 2 == 0) {
                sum += i;
            } else {
                sum -= i;
            }
        }

        return sum;
    }

}
