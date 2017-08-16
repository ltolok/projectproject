package lesson16;

import java.util.ArrayList;
import java.util.List;

public class HeavyBoxDemo {
    public static void main(String[] args) {
        List<HeavyBox> arrayList = new ArrayList<>();
        arrayList.add(new HeavyBox());
        HeavyBox heavyBox = new HeavyBox(3);
        arrayList.add(heavyBox);
        for (HeavyBox hb : arrayList) {
            System.out.println(hb.weight);

        }
        System.out.println(arrayList.size());
    }
}
