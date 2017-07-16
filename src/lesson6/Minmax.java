package lesson6;

import java.util.Arrays;

public class Minmax {
    public static void main(String[] args) {
        int size1 = 5;
        int size2 = 8;
        int[][] mas =
                {
                        {11, 9, 10, 6, 8, 5, 3, 1},
                        {2, 5, 1, 12, 6, 7, 8, 3},
                        {7, 2, 3, 1, 4, 9, 13, 3},
                        {14, 1, 12, 3, 6, 7, 8, 9},
                        {2, 5, 7, 3, 4, 1, 15, 8}};
        System.out.println(Arrays.deepToString(mas));
        int[][] mm = new int[5][2];
        for (int i = 0; i < size1; i++) {
            int min = mas[i][0];
            int max = mas[i][0];
            for (int j = 1; j < size2; j++) {
                if (mas[i][j] < min) {
                    min = mas[i][j];
                }
                if (mas[i][j] > max) {
                    max = mas[i][j];
                }
                mm[i][0] = min;
                mm[i][1] = max;
            }
            System.out.println("Строка " + i + "  min" + mm[i][0] + "  " + "   max " + mm[i][1]);
        }
        System.out.println(Arrays.deepToString(mm));
    }
}

