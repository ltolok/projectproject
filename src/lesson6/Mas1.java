package lesson6;

import java.util.*;

public class Mas1 {
    public static void main(String[] args) {
        String mas[][] = new String[3][6];
        int i, j;
        char ch = 'a';
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 6; j++) {
                String s = Character.toString(ch) + Integer.toString(j);
                mas[i][j] = s;
            }
            ch++;
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 6; j++) {
                System.out.print(mas[i][j]);
            }
            System.out.println();
        }
    }
}
