package lesson4;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, n, k, min = 0;
        for (i = 1; i < 4; i++) {
            System.out.print("Введите целое число " + i + ":  ");
            if (in.hasNextInt()) {
                n = in.nextInt();
                k = n < 0 ? -n : n;
                if (i == 1 | min > k) {
                    min = k;
                }
            } else {
                System.out.println("Ошибка.Число не является целым.");
                return;
            }
        }
        System.out.println("Минимальное по модулю число  " + min);
    }
}
