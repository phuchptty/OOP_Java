package TH2;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class B3 {
    private int day;
    private int month;
    private int year;
    private Scanner sc = new Scanner(System.in);

    public void insert() {
        System.out.println("Nhập ngày");
        this.day = sc.nextInt();
        System.out.println("Nhập tháng");
        this.month = sc.nextInt();
        System.out.println("Nhập year");
        this.year = sc.nextInt();
    }

    public void dayInYear() {
        LocalDate ld = LocalDate.of(year, month, day);
        int dayOfYear = ld.getDayOfYear();

        System.out.println("Ngày " + day + "/" + month + "/" + year + " là ngày thứ " + dayOfYear + " trong năm.");
    }

    public static void main(String[] args) {
        B3 b3 = new B3();
        b3.insert();
        b3.dayInYear();
    }
}
