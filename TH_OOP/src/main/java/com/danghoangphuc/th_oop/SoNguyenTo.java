package com.danghoangphuc.th_oop;

public class SoNguyenTo {
    private int a;

    private boolean isSoNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void setA(int a) {
        if (isSoNguyenTo(a)) {
            this.a = a;
        } else {
            System.out.println("X không phải là số nguyên tố");
        }
    }

    public int getA() {
        return a;
    }

    public SoNguyenTo() {
    }

    public SoNguyenTo(int a) {
        this.setA(a);
    }

    public int timSoNguyenToTiepTheo() {
        a++;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                a++;
                i = 2;
            } else {
                continue;
            }
        }
        return a;
    }
}
