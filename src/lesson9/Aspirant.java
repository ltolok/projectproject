package lesson9;

public class Aspirant extends Student {
    private String scwork;

    public Aspirant(String a, String b, String g, double c, String d) {
        super(a, b, g, c);
        this.scwork = d;
    }

    public void setScwork(String scwork) {
        this.scwork = scwork;
    }

    public String getScwork() {

        return scwork;
    }

    public static void main(String[] args) {
        Aspirant aspirant = new Aspirant("Александр", "Петров", "Группа 2", 1200, "Тема научной работы BBBXXXSSS");
        aspirant.print();
        aspirant.setFirstName("Иван");
        aspirant.setLastName("Иванoв");
        aspirant.setGroup("Группа А1");
        aspirant.setScwork("Тема научной работы FFFDDDSS");
        aspirant.print();
    }


    public void print() {
        System.out.println(getFirstName() + " " + getLastName() + "   " + getGroup() + "   " + getScwork() + "   " + "Стипедия  " + getScholarship());
    }

    public double getScholarship() {
        return 1200.00;
    }
}