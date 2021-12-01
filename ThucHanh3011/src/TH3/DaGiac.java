package TH3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DaGiac {
    protected int soCanh;
    protected List<Integer> arrInt;

    public DaGiac() {
    }

    public DaGiac(int soCanh) {
        this.soCanh = soCanh;
    }

    public int getSoCanh() {
        return soCanh;
    }

    protected void setSoCanh(int soCanh) {
        this.soCanh = soCanh;
    }

    public void nhapCacCanh() {
        Scanner sc = new Scanner(System.in);
        arrInt = new ArrayList<Integer>();
        if (soCanh >= 3) {
            System.out.println("Nhap cac canh: ");
            for (int i = 0; i < soCanh; i++) {
                arrInt.add(sc.nextInt());
            }
        } else {
            System.out.println("Nhap so canh cua da giac !!! (So canh >= 3)");
        }
    }

    @Override
    public String toString() {
        if (arrInt != null && soCanh >= 3) {
            String info = "Da giac co " + soCanh + "canh, do dai cac canh la: ";
            for (Integer i : arrInt) {
                info = info + " " + i;
            }
            return info;
        }
        return "opps";
    }

    public double chuvi() {
        int cv = 0;
        for (Integer i : arrInt) {
            cv = cv + i;
        }
        return cv;
    }
}
