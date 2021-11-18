package bai12;

public class SinhVien extends Person{
    private int debtTuition;

    public SinhVien(String name, int yearBorn, String code, int debtTuition) {
        super(name, yearBorn, code);
        this.debtTuition = debtTuition;
    }

}
