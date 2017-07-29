package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Garland {
    enum Method {METHOD1, METHOD2, METHOD3, METHOD4}

    public static void main(String[] args) {
        Method[] methods = Method.values();
        int n = rnd();
        Scanner in = new Scanner(System.in);
        System.out.println("Задайте метод: ");
        System.out.println("1.Лампочки мигают");
        System.out.println("2.Гирлянда в режиме бегущей строки.");
        System.out.println("3.Определить горит ли первая лампочка слева?");
        System.out.println("4.Определить горит ли первая лампочка справа?");
        int number = in.nextInt() - 1;
        switch (methods[number]) {
            case METHOD1: {
                tick1(n);
                break;
            }
            case METHOD2: {
                tick2(n);
                break;
            }
            case METHOD3: {
                tick3(n);
                break;
            }
            case METHOD4: {
                tick4(n);
                break;
            }
        }
    }

    static void tick1(int n) {
        System.out.println("Метод 1");
        for (int i = 0; i < 5; i++) {
            n = ~n;
            System.out.println(Integer.toBinaryString(n));
        }
        System.out.println();
    }

    static void tick2(int n) {
        System.out.println("Метод 2");
        for (int i = 0; i < 7; i++) {
            n = n << 1;
            System.out.println(Integer.toBinaryString(n));
        }
        System.out.println();
    }

    static void tick3(int n) {
        if (n < 0) {
            System.out.println("Метод 3");
            System.out.println("Первая лампочка слева горит    " + Integer.toBinaryString(n));
        }
    }

    static void tick4(int n) {
        int t = n & 1;
        if (t == 1) {
            System.out.println("Метод 4");
            System.out.println("Первая лампочка справа горит    " + Integer.toBinaryString(n));
        } else {
            System.out.println("Первая лампочка справа не горит    " + Integer.toBinaryString(n));
        }
    }

    static int rnd() {
        Random rand = new Random();
        return rand.nextInt();
    }
}

