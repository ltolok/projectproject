package lesson8;

import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Matrix {
    int nl = 3;
    int nc = 3;
    double[][] v = new double[nl][nc];

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
        Matrix msum = new Matrix(0);
        Matrix mr = new Matrix(0);
        System.out.println("Матрица 1");
        m1.pr(m1.nl, m1.nc, m1.v);
        System.out.println("Матрица 2");
        m2.pr(m2.nl, m2.nc, m2.v);
        System.out.println("Матрица 3");
        msum.pr(msum.nl, msum.nc, msum.v);
        System.out.println("Матрица 4");
        msum.pr(mr.nl, mr.nc, mr.v);
        msum.sum(msum, m1, m2);
        System.out.println("");
        System.out.println("Матрица 3 - результат суммирования ");
        msum.pr(msum.nl, msum.nc, msum.v);
        System.out.println("");
        System.out.print("Введите число: ");
        Scanner scn = new Scanner(System.in);
        double n = scn.nextDouble();
        mr.mp(mr, m1, n);
        System.out.println("Матрица 3 - результат умножения " + "Матрица 1" + "   *   " + n);
        mr.pr(mr.nl, mr.nc, mr.v);
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

    void sum(Matrix msum, Matrix m1, Matrix m2) {
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                msum.v[i][j] = m1.v[i][j] + m1.v[i][j];
            }
        }
    }

    void mp(Matrix mr, Matrix m1, double c) {
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                mr.v[i][j] = m1.v[i][j] * c;
            }
        }
    }
}

