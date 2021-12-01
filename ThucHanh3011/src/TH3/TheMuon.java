package TH3;

import java.util.Scanner;

class TheMuon {
    private String soPhieuMuon;
    private String ngayMuon;
    private String hanTra;
    private String soHieusach;
    private SinhVien sinhVien = new SinhVien();

    public TheMuon() {
    }

    public TheMuon(String soPhieuMuon, String ngayMuon, String hanTra, String soHieusach, SinhVien sinhVien) {
        this.soPhieuMuon = soPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieusach = soHieusach;
        this.sinhVien = sinhVien;
    }

    public String getSoPhieuMuon() {
        return soPhieuMuon;
    }

    public void setSoPhieuMuon(String soPhieuMuon) {
        this.soPhieuMuon = soPhieuMuon;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getHanTra() {
        return hanTra;
    }

    public void setHanTra(String hanTra) {
        this.hanTra = hanTra;
    }

    public String getSoHieusach() {
        return soHieusach;
    }

    public void setSoHieusach(String soHieusach) {
        this.soHieusach = soHieusach;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so phieu muon: ");
        soPhieuMuon = scanner.nextLine();
        System.out.println("Nhap ngay muon: ");
        ngayMuon = scanner.nextLine();
        System.out.println("Nhap han tra: ");
        hanTra = scanner.nextLine();
        System.out.println("Nhap so hieu sach: ");
        soHieusach = scanner.nextLine();
        sinhVien.input();
    }

    @Override
    public String toString() {
        return "SoPhieuMuon='" + soPhieuMuon + '\'' +
                ", ngayMuon='" + ngayMuon + '\'' +
                ", hanTra='" + hanTra + '\'' +
                ", soHieusach='" + soHieusach + '\'' +
                ", sinhVien= {" + sinhVien + '}';
    }
}