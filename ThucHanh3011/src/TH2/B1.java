package TH2;

public class B1 {
    private int i;

    public B1(int i) {
        this.i = i;
    }

    public B1() {
        this.i = 0;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void valueI() {
        System.out.println("Số trước i: " + i--);
        System.out.println("Số sau i: " + (i + 2));
    }

    public static void main(String[] args) {
        B1 b1 = new B1(10);
        b1.valueI();
    }
}
