package lesson11;

public class Guitar implements Tool {
    int amountTurbine = 6;

    @Override
    public String toString() {
        return "Guitar{" +
                "Количество струн = " + amountTurbine +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Звучит гитара.  " + toString());
    }
}
