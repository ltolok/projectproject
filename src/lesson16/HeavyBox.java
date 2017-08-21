package lesson16;

public class HeavyBox implements Comparable<HeavyBox> {
    int weight; // вес коробки

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                '}';
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public HeavyBox() {
    }

    public HeavyBox(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(HeavyBox o) {
        return this.weight - o.weight;
    }
}
