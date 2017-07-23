package lesson4;

import java.util.Scanner;

public class Prog1 {
    public static void main(String args[]) {
        int i = 2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        if (sc.hasNextInt()) {
            i = sc.nextInt();
            System.out.println(i);
        } else {
            System.out.println("Вы ввели не целое число");
            return;
        }
        if (i % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }
}