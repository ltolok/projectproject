package lesson16;


import java.util.TreeSet;

public class HeavyBoxDemo2 {

    public static void main(String[] args) {
        TreeSet<HeavyBox> heavyBoxes = new TreeSet();
        heavyBoxes.add(new HeavyBox());
        HeavyBox heavyBox = new HeavyBox(3);
        heavyBoxes.add(heavyBox);
        for (HeavyBox hb : heavyBoxes) {
            System.out.println(hb.weight);
        }
    }
}
