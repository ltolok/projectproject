package lesson11;

public class Drum implements Tool {
    int size = 50;

    @Override
    public String toString() {
        return "Drum{" +
                " Размер = " + size +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Звучит барабан.   " + toString());
    }
}
