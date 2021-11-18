package bai12;

public class GiamDoc extends Person{
    private int monthlySpending;

    public GiamDoc(String name, int yearBorn, String code, int monthlySpending) {
        super(name, yearBorn, code);
        this.monthlySpending = monthlySpending;
    }
}
