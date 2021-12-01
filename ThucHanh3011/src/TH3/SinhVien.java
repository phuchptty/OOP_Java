package TH3;


import java.util.Calendar;
import java.util.Scanner;

public class SinhVien {
    private String name;
    private int dateOfBirth;
    private int age;
    private String grade;

    public SinhVien() {
    }

    public SinhVien(String name, int dateOfBirth, int age, String grade) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = scanner.nextLine();
        System.out.println("Nhap nam sinh: ");
        dateOfBirth = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap lop: ");
        grade = scanner.nextLine();
        age = Calendar.getInstance().get(Calendar.YEAR) - dateOfBirth + 1;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", grade='" + grade + '\'';
    }
}