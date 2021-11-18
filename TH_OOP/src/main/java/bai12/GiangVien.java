package bai12;

public class GiangVien extends Person{
    private int monthSalary;

    public GiangVien(String name, int yearBorn, String code, int monthSalary) {
        super(name, yearBorn, code);
        this.monthSalary = monthSalary;
    }
}
