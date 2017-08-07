package lesson9;

public class Aspirant extends Student {
    private String scwork;

    @Override
    public String toString() {
        return "Aspirant{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", group='" + getGroup() + '\'' +
                "scwork='" + scwork + '\''
                ;
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

    public Aspirant(String a, String b, String g, String d) {
        super(a, b, g);
        this.scwork = d;
    }

    public void setScwork(String scwork) {
        this.scwork = scwork;
    }

    public String getScwork() {
        return scwork;
    }

    public void print() {
        System.out.println(toString() + ",  Scholarship= " + getScholarship() + "}");
    }

    public double getScholarship() {
        return 1200.00;
    }
}