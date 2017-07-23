package lesson9;

import java.util.Arrays;

public class Aspirant extends Student {
    String scwork;
    public String student[];

    public String getScwork() {
        return scwork;
    }

    public void setScwork(String scwork) {

        this.scwork = scwork;
    }

    public Aspirant(String a, String b, String g, double c, String d) {
        super(a, b, g, c);
        this.scwork = d;

    }

    public static void main(String[] args) {
        Aspirant aspirant1 = new Aspirant("Александр", "Петров", "Группа 2", 1200, "Тема научной работы BBBXXXSSS");
        aspirant1.setFirstName("Иван");
        aspirant1.setLastName("Иванoв");
        aspirant1.setGroup("Группа А1");
        aspirant1.setScwork("Тема научной работы FFFDDDSS");
        //aspirant1.print();
        Student[] st = new Student[2];
        st[0] = new Student("Владимир", "Петров", "Группа 3", 0);
        st[1] = new Aspirant("Владимир", "Вовк", "Группа 3A", 0, "Научная работа аспиранта");
        for (Student student : st) {
            student.getScholarship();
            System.out.println(student.getScholarship());
        }
    }


    void print() {
        System.out.println(this.firstName + " " + this.lastName + "  " + this.group + "" + this.scwork + "   " + "Стипедия" + this.sum);
    }

    double getScholarship() {
        return 1200.00;
    }
}