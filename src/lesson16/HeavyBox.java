package lesson16;

public class HeavyBox implements Comparable<HeavyBox> {
    int weight; // вес коробки

    public HeavyBox() {
    }

    public HeavyBox(int weight) {

        this.weight = weight;
    }

    @Override
    public int compareTo(HeavyBox o) {
        return this.weight-o.weight;
    }
}
