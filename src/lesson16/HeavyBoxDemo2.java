package lesson16;


import java.util.Set;
import java.util.TreeSet;

public class HeavyBoxDemo2 {

    public static void main(String[] args) {
        Set<HeavyBox> heavyBoxes = new TreeSet<>();
        heavyBoxes.add(new HeavyBox());
        HeavyBox heavyBox = new HeavyBox(3);
        heavyBoxes.add(heavyBox);
        HeavyBox heavyBox1 = new HeavyBox(5);
        heavyBoxes.add(heavyBox1);
        HeavyBox heavyBox2 = new HeavyBox(1);
        heavyBoxes.add(heavyBox2);
        for (HeavyBox hb : heavyBoxes) {
            System.out.println(hb.weight);
        }
    }
}
