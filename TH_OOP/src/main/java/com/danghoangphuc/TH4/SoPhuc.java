package com.danghoangphuc.TH4;

import java.util.Scanner;

public class SoPhuc {
    private double phanThuc;
    private double phanAo;

    public SoPhuc() {
    }

    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public void nhapSoPhuc(Scanner sc) {
        System.out.print("\tNhap vao phan thuc: ");
        phanThuc = sc.nextDouble();
        System.out.print("\tNhap vao phan ao: ");
        phanAo = sc.nextDouble();
    }

    public void inSoPhuc() {
        if (phanAo < 0) {
            System.out.println(phanThuc + " - " + Math.abs(phanAo) + "*i");
        } else {
            System.out.println(phanThuc + " + " + phanAo + "*i");
        }
    }

    public SoPhuc congSoPhuc(SoPhuc sp2) {
        double phanThucMoi = phanThuc + sp2.phanThuc;
        double phanAoMoi = phanAo + sp2.phanAo;
        return new SoPhuc(phanThucMoi, phanAoMoi);
    }

    public SoPhuc nhanSoPhuc(SoPhuc sp2) {
        double phanThucMoi = phanThuc * sp2.phanThuc - phanAo * sp2.phanAo;
        double phanAoMoi = phanThuc * sp2.phanAo + sp2.phanThuc * phanAo;
        return new SoPhuc(phanThucMoi, phanAoMoi);
    }
}
