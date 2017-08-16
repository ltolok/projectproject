package lesson11;

public class Guitar implements Tool {
    private int amountTurbine;

    Guitar(int aT) {
        amountTurbine = aT;
    }

    public int getAmountTurbine() {
        return amountTurbine;
    }

    public void setAmountTurbine(int amountTurbine) {
        this.amountTurbine = amountTurbine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Guitar guitar = (Guitar) o;

        return amountTurbine == guitar.amountTurbine;
    }

    @Override
    public int hashCode() {
        return amountTurbine;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "Количество струн = " + getAmountTurbine() +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Звучит гитара.  " + toString());
    }
}
