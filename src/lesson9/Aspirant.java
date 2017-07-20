package lesson9;

public class Aspirant extends Student {
    String scwork;

    public String getScwork() {
        return scwork;
    }

    public void setScwork(String scwork) {

        this.scwork = scwork;
    }

    public Aspirant(String a, String b, String c, String d) {
        super(a, b, c);
        this.scwork = d;
    }

    public static void main(String[] args) {
        Aspirant aspirant1 = new Aspirant("Александр", "Петров", "Группа 2", "Тема научной работы BBBXXXSSS");
        aspirant1.setFirstName("Иван");
        aspirant1.setLastName("Иванoв");
        aspirant1.setGroup("Группа А1");
        aspirant1.setScwork("Тема научной работы FFFDDDSS");
        aspirant1.pr();
    }

    void pr() {
        System.out.println(this.firstName + " " + this.lastName + "  " + this.group + "" + this.scwork);
    }
}
