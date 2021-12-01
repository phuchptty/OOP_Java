package TH2;

public class B6 {
    public void c1(int n) {
        int sum = 1;
        int lastNumber = (int) (Math.pow(1, n) * 1 * n);

        for (int i = 2; i <= lastNumber; i++) {
            if (i % 2 == 0) {
                sum += i;
            } else {
                sum -= i;
            }
        }

        System.out.println("Tổng S = " + sum);
    }

    public static long factorial(int n) {
        long factorial = 1;
        if (n == 0 || n == 1) {
            return factorial;
        } else {
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    public void c2(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += factorial(i);
        }

        System.out.println("Tổng S=" + sum);
    }

    private int sum(int n, int start) {
        int sum = 0;
        for (int i = start; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    public void c3(int n) {
        int s = 0;

        if (n % 2 == 0) {
            s = sum(n, 2);
        } else {
            s = sum(n, 1);
        }

        System.out.println("Tổng S = " + s);
    }

    public void c4(double n) {
        double sum = 0;

        for (double i = 2; i <= n; i++) {
            sum += (i - 1) / i;
        }

        System.out.println("Tổng S = " + sum);
    }

    public static void main(String[] args) {
        B6 b6 = new B6();
        b6.c4(5);
    }
}
