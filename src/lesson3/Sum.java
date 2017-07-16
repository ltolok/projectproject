package lesson3;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int s = 0;
        for (int i = 0; i < 2; i++) {
            System.out.print("Введите целое число " + (i+1) + ":  ");
            if (in.hasNextInt()) {
                n = in.nextInt();
                s += n;
            } else {
                System.out.println("Ошибка.Число не является целым.");
                return;
            }
        }
        System.out.println("Сумма = " + s);
    }
}

