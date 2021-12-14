package TH3;

import java.util.Scanner;

public class KhachHang {

    private String hoTen;
    private int soNha;
    private int msct;

    public KhachHang() {
    }

    public KhachHang(String hoTen, int soNha, int msct) {
        this.hoTen = hoTen;
        this.soNha = soNha;
        this.msct = msct;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public int getMsct() {
        return msct;
    }

    public void setMsct(int msct) {
        this.msct = msct;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten Khach Hang: ");
        hoTen = sc.nextLine();
        System.out.println("So Nha: ");
        soNha = sc.nextInt();
        System.out.println("MSCT: ");
        msct = sc.nextInt();
        
    }

    public void output() {
        System.out.println("Ten Khach Hang: " + this.hoTen);
        System.out.println("So Nha: " + this.soNha);
        System.out.println("MSCT: " + this.msct);
    }
}
