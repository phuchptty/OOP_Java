package TH1;

import java.util.Scanner;

public class DaGiac {
    protected int soCanh;
    protected int chieuDai[];

    Scanner scanner = new Scanner(System.in);

    public DaGiac() {
        this.soCanh = 0;
        this.chieuDai = null;
    }

    public DaGiac(int soCanh, int[] chieuDai) {
        this.soCanh = soCanh;
        this.chieuDai = chieuDai;
    }

    public int getSoCanh() {
        return soCanh;
    }

    public void setSoCanh(int soCanh) {
        this.soCanh = soCanh;
    }

    public int[] getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int[] chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void inputBorder() {
        do {
            System.out.println("Nhập vào số cạnh: ");
            this.soCanh = scanner.nextInt();

        } while (this.soCanh <= 2);

        for (int i = 0; i < this.soCanh; i++) {
            System.out.println("Nhập cạnh thứ " + (i + 1) + " :");
            this.chieuDai[i] = scanner.nextInt();
        }
    }

    public int getArea() {
        int cv = 0;
        for (int i = 0; i < this.soCanh; i++) {
            cv += this.chieuDai[i];
        }
        return cv;
    }

    public void exportBorders() {
        System.out.println("Độ dài các cạnh lần lượt là: ");
        for (int i = 0; i < this.soCanh; i++) {
            if (i < (this.soCanh - 1)) {
                System.out.print(this.chieuDai[i] + "\t  \t");
            } else {
                System.out.println(this.chieuDai[i]);
            }
        }
        System.out.println("--------------------End--------------------");
    }
}
