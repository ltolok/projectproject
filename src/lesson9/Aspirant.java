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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aspirant aspirant = (Aspirant) o;

        return scwork != null ? scwork.equals(aspirant.scwork) : aspirant.scwork == null;
    }

    @Override
    public int hashCode() {
        return scwork != null ? scwork.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", group='" + getGroup() + '\'' +
                ", sum=" + getSum() + '\'' +
                ", scwork= " + getScwork() +
                '}';
    }

    public void print() {
        System.out.println(toString());
    }

    public static double getScholarship() {
        return 1200.00;
    }
}