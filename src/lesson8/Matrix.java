package lesson8;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    int nl = 3;
    int nc = 3;
    double[][] v = new double[nl][nc];
    int n;

    Matrix() {
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                v[i][j] = rnd();
            }
        }
    }

    Matrix(int k) {
        if (k == 0) {
            for (int i = 0; i < nl; i++) {
                for (int j = 0; j < nc; j++) {
                    v[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix();
        Matrix mrez = new Matrix(0);
        System.out.println("Матрица 1");
        m1.pr(m1.nl, m1.nc, m1.v);
        System.out.println("Матрица 2");
        m2.pr(m2.nl, m2.nc, m2.v);
        System.out.println("Матрица 3");
        mrez.pr(mrez.nl, mrez.nc, mrez.v);

        mrez.sum(3, 3, m1.v, m2.v);
        System.out.println("Матрица 3 - результат суммирования ");
        mrez.pr(mrez.nl, mrez.nc, mrez.v);

        System.out.print("Введите число: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        mrez.mp(3, 3, n, m1.v);
        System.out.println("Матрица 3 - результат умножения ");
        mrez.pr(mrez.nl, mrez.nc, mrez.v);
    }

    double rnd() {
        double num = Math.random();
        return num;
    }

    static void pr(int a, int b, double v[][]) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(v[i][j] + " ");
            }
            System.out.println("");
        }
    }

    double sum(int a, int b, double m1[][], double m2[][]) {
        double s[][] = new double[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                s[i][j] = m1[i][j] + m2[i][j];
            }
            ;
        }
        return s[a][b];

    }

    double mp(int a, int b, double c, double m1[][]) {
        double s[][] = new double[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                s[i][j] = m1[i][j] * c;
            }
            ;
        }
        return s[a][b];
    }
}
