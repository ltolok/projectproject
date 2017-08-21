package lesson11;

public class Trumpet implements Tool {
    private int diameter;

    public Trumpet(int d) {
        diameter = d;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trumpet trumpet = (Trumpet) o;

        return diameter == trumpet.diameter;
    }

    @Override
    public int hashCode() {
        return diameter;
    }

    public void setDiameter(int diameter) {

        this.diameter = diameter;
    }

    public int getDiameter() {

        return diameter;
    }

    @Override
    public String toString() {
        return "Trumpet{" +
                "Диаметр = " + getDiameter() +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Играет труба.  " + toString() + " Нажата клавиша " + "\"" + KEY + "\"");
    }
}
