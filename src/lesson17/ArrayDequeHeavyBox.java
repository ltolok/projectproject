package lesson17;

import lesson16.HeavyBox;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeHeavyBox {
    public static void main(String[] args) {
        Deque<HeavyBox> queue = new ArrayDeque<>();
        queue.offer(new HeavyBox(3));
        queue.offer(new HeavyBox(4));
        queue.offer(new HeavyBox(6));
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}
