package com.danghoangphuc.TH4;

public class VanDung {
    public static void main(String[] args) {
        int x = 10;

        System.out.println(ToanHoc.kiemtraHoanHao(x));
        System.out.println(ToanHoc.kiemtraNguyenTo(x));
        System.out.println(ToanHoc.kiemtraSoChinhPhuong(x));
        System.out.println(ToanHoc.tinhFibo(x));
        System.out.println(ToanHoc.tinhTongC7(x));
        System.out.println(ToanHoc.tinhTongC6(x));
        System.out.println(ToanHoc.tinhTongC5(x));
        System.out.println(ToanHoc.tinhTongC8(x));

        Diem D1 = new Diem(3, 7);
        Diem D2 = new Diem(9, 3);

        System.out.println(D1.tinhKhoangCach(D2));

        SoPhuc A = new SoPhuc(5,3);
        SoPhuc B = new SoPhuc(2,4);

        SoPhuc C1 = A.congSoPhuc(B);
        C1.inSoPhuc();

        SoPhuc C = A.nhanSoPhuc(B);
        C.inSoPhuc();
    }
}
