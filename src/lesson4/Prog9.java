package lesson4;

import java.util.Scanner;

public class Prog9 {
    public static void main(String[] args) {
        System.out.print("Введите натуральное число: ");
        Scanner scn = new Scanner(System.in);
        int i, n, f;
        if (scn.hasNextInt()) {
            n = scn.nextInt();
            if (n == 0) {
                System.out.println("Факториал числа равен " + 1);
            } else {
                f = 1;
                for (i = 1; i <= n; i++) {
                    f = f * i;
                }
                System.out.println("Факториал числа равен " + f);
            }
        } else {
            System.out.println("Вы ввели не натуральное число");
        }
    }
}
