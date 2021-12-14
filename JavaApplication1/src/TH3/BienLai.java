package TH3;

import java.util.Scanner;

class BienLai {

    private float chiSoCu, chiSoMoi;
    private float tien;
    public KhachHang KhachHang = new KhachHang();

    public BienLai() {
    }

    public BienLai(float chiSoCu, float chiSoMoi, float tien) {
        this.chiSoCu = 0;
        this.chiSoMoi = 0;
        this.tien = 0;
    }

    public float getChiSoCu() {
        return chiSoCu;
    }

    public void setChiSoCu(float chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

    public float getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(float chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }

    public float getTien() {
        return tien = (chiSoMoi - chiSoCu) * 850000;
    }

    public void setTien(float tien) {
        this.tien = tien;
    }

    public void input() {
        KhachHang.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chi so cu: ");
        chiSoCu = sc.nextFloat();
        System.out.println("Nhap chi so moi: ");
        chiSoMoi = sc.nextFloat();
        sc.close();
    }

    public void output() {
        KhachHang.output();
        System.out.println("So tien phai tra: " + this.tien);
    }

    public static void main(String[] args) {
        BienLai bl = new BienLai();
        bl.input();
        bl.output();
    }
}
