package TH3;

public class TamGiac extends DaGiac {
    public TamGiac() {
        soCanh = 3;
    }

    public double dienTich() {
        double p = chuvi() / 2;
        return Math.sqrt(p * (p - arrInt.get(0)) * (p - arrInt.get(1)) * (p - arrInt.get(2)));
    }

    public static void main(String[] args) {
        TamGiac tg = new TamGiac();

        tg.nhapCacCanh();

        System.out.println("Chu vi: " + tg.chuvi());
        System.out.println("Diện tích: " + tg.dienTich());
    }
}