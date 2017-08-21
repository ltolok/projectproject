package lesson17;

import lesson16.HeavyBox;

import java.util.Iterator;
import java.util.LinkedList;

public class ArrayDequeHeavyBox1 {

    public static void main(String[] args) {
        LinkedList<HeavyBox> queue = new LinkedList<HeavyBox>();
        queue.add(new HeavyBox(100));
        queue.add(new HeavyBox(500));
        queue.add(new HeavyBox(700));
        queue.add(new HeavyBox(350));
        LinkedList<HeavyBox> queue1 = new LinkedList<HeavyBox>();
        Iterator<HeavyBox> iterator = queue.iterator();
        while (iterator.hasNext()) {
            HeavyBox heavyBox = iterator.next();
            if (heavyBox.getWeight() > 300) {
                iterator.remove();
                queue1.add(heavyBox);
            }
        }
        System.out.println(queue1);
    }
}