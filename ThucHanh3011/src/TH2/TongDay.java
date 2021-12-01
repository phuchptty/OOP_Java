package TH2;

public class TongDay {
    int n;
    double k, x;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public TongDay() {
    }

    public TongDay(int n, double x, double k) {
        this.n = n;
        this.k = k;
        this.x = x;
    }

    public double sum() {
        double tu = 1, mau, sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                mau = (double) (Math.pow(x, i) + Math.pow(k, i));
            } else {
                mau = (double) (Math.pow(x, i) - Math.pow(k, i));
            }
            tu *= i;
            sum += ((double) tu / mau);
        }
        return sum;
    }
}