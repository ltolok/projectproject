package lesson4;

import java.util.Random;

public class Ticker {
    public static void main(String[] args) {
        int n = rnd();
        tick1(n);
        tick2(n);
        tick3(n);
        tick4(n);
    }

    public static void tick1(int n) {
        System.out.println("Метод 1");
        for (int i = 0; i < 5; i++) {
            n = ~n;
            System.out.println(Integer.toBinaryString(n));
        }
        System.out.println();
    }

    public static void tick2(int n) {
        System.out.println("Метод 2");
        for (int i = 0; i < 7; i++) {
            n = n << 1;
            System.out.println(Integer.toBinaryString(n));
        }
        System.out.println();
    }

    public static void tick3(int n) {
        if (n < 0) {
            System.out.println("Метод 3");
            System.out.println("Первая лампочка слева горит    " + Integer.toBinaryString(n));
        }
    }

    public static void tick4(int n) {
        System.out.println(Integer.toBinaryString(n));
        int t = n & 1;
        if (t == 1) {
            System.out.println("Метод 4");
            System.out.println("Первая лампочка справа горит    " + Integer.toBinaryString(n));
        }
    }

    public static int rnd() {
        Random rand = new Random();
        return rand.nextInt();
    }
}
