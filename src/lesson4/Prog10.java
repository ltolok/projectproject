package lesson4;

import java.util.*;

public class Prog10 {
    public static void main(String[] args) {
        double a = Math.random() * 10;
        int i, n, f;
        n = (int) a;
        if (n == 0) {
            System.out.println("Факториал числа " + n + " равен " + 1);
        } else {
            f = 1;
            for (i = 1; i <= n; i++) {
                f = f * i;
            }
            System.out.println("Факториал числа " + n + " равен " + f);
        }
    }
}
