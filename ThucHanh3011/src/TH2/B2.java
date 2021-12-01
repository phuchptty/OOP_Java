package TH2;

public class B2 {
    private int i;

    public B2(int i) {
        this.i = i;
    }

    public B2() {
        this.i = 0;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void getBinary() {
        System.out.println("Giá trị nhị phân: " + Integer.toBinaryString(i));
    }

    public static void main(String[] args) {
        B2 b2 = new B2(10);
        b2.getBinary();
    }
}
