package bai12;

public class Person {
    private String name;
    private int yearBorn;
    private String code;

    public Person(String name, int yearBorn, String code) {
        this.name = name;
        this.yearBorn = yearBorn;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
