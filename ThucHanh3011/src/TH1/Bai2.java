package TH1;

import java.util.Scanner;

public class Bai2 {
    private float a;
    private double b;
    Scanner scanner = new Scanner(System.in);

    public Bai2(float a, double b) {
        this.a = a;
        this.b = b;
    }

    public Bai2() {
        this.a = 0f;
        this.b = 0f;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void input() {
        System.out.println("Nhập Số 1 (Float): ");
        this.a = scanner.nextFloat();
        System.out.println("Nhập Số 2 (Double): ");
        this.b = scanner.nextDouble();
    }

    public double add() {
        return a + b;
    }

    public double substract() {
        return a - b;
    }

    public double multiply() {
        return a * b;
    }

    public double divide() {
        return a / b;
    }

}
