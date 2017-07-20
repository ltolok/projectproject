package lesson6;

import java.util.Arrays;
import java.util.Random;

public class Ticker1 {
    public static void main(String[] args) {
        int[] t = new int[8];
        tick(t);
        tick1(t);
        tick2(t);
        tick3(t);
    }

    public static void tick(int t[]) {
        for (int i = 0; i < t.length; i++) {
            t[i] = random();
        }
        print(t);
    }

    public static void tick1(int t[]) {
        System.out.println("Метод 1");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < t.length; j++) {
                if (t[j] == 0) {
                    t[j] = 1;
                } else {
                    t[j] = 0;
                }
            }
            print(t);
        }
    }

    public static void tick2(int t[]) {
        System.out.println("Метод 2");
        for (int i = 0; i < t.length; i++) {
            System.arraycopy(t, i, t, i + 1, t.length - i - 1);
            t[i] = 0;
            print(t);
        }
    }

    public static void tick3(int t[]) {
        System.out.println("Метод 3");
        if (t[0] == 1) {
            System.out.println("Первая лампочка слева горит    ");
        } else {
            System.out.println("Первая лампочка слева не горит    ");
        }
    }

    public static int random() {
        double num = Math.random() * 2;
        return (int) num;
    }

    public static void print(int t[]) {
        System.out.println(Arrays.toString(t));
    }
}
