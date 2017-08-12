package lesson11;

public class Trumpet implements Tool {
    int diameter = 123;

    @Override
    public String toString() {
        return "Trumpet{" +
                "Диаметр = " + diameter +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Играет труба.  " + toString() + " Нажата клавиша " + "\"" + KEY + "\"");
    }
}
