package TH2;

public class ToanHoc {
    public void isPrimeNumber(int n) {
        if (n < 2) {
            System.out.println("Không phải là số nguyên tố");
        }

        int squareRoot = (int) Math.sqrt(n);

        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                System.out.println("Không phải là số nguyên tố");
            }
        }
        System.out.println("Là số nguyên tố");
    }

    public void isPerfectNumber(int n) {
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                // sum all divisor
                sum += i;
        }

        if (sum == n) {
            System.out.println(n + " là số hoàn hảo");
        } else {
            System.out.println(n + " không phải là số hoàn hảo");
        }
    }

    public void isPerfectSquare(int n) {
        double sq = Math.sqrt(n);

        if ((sq - Math.floor(sq)) == 0) {
            System.out.println(n + " là số chính phương");
        } else {
            System.out.println(n + " không phải là số chính phương");
        }
    }

    public void findFibo(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if (n == 0) {
            System.out.println("Phần thử thứ " + n + " là: 2");
        } else if (n == 1) {
            System.out.println("Phần thử thứ " + n + " là: 1");
        } else if (n > 1) {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }

            System.out.println("Phần thử thứ " + n + " là: " + fn);
        }
    }

    public static void main(String[] args) {
        ToanHoc th = new ToanHoc();

        th.findFibo(9);
    }
}
