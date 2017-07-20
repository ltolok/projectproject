package lesson8;

import java.util.Scanner;
import java.util.Arrays;

public class Matrix {
    static int nl = 3;
    static int nc = 3;
    double[][] v = new double[nl][nc];

    Matrix() {
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                v[i][j] = random();
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
        m1.print();
        System.out.println("Матрица 2");
        m2.print();
        System.out.println("Матрица 3 (сумма матриц 1 и 2)");
        msum.print();

        System.out.println("Матрица 4(произведение матрицы 1 на число)");
        msum.print();
        msum.sum(msum, m1, m2);
        System.out.println();

        System.out.println("Матрица 3 - результат суммирования ");
        msum.print();
        System.out.println();

        System.out.print("Введите число: ");
        Scanner scn = new Scanner(System.in);
        double n = scn.nextDouble();
        mr.multiply(mr, m1, n);
        System.out.println("Матрица 3 - результат умножения " + "Матрица 1" + "   *   " + n);
        mr.print();
    }

    double random() {
        return Math.random();
    }

    void print() {
        for (int i = 0; i < this.nl; i++) {
            for (int j = 0; j < this.nc; j++) {
                System.out.print(this.v[i][j] + " ");
            }
            System.out.println();
        }
    }

    void sum(Matrix msum, Matrix m1, Matrix m2) {
        if (m1.v.length == m2.v.length & m1.v[0].length == m1.v[0].length) {
            for (int i = 0; i < nl; i++) {
                for (int j = 0; j < nc; j++) {
                    msum.v[i][j] = m1.v[i][j] + m2.v[i][j];
                }
            }
        } else {
            System.out.println("Матрицы разной размерности. Операция суммирования невозможна!");
        }
    }

    void multiply(Matrix mr, Matrix m1, double c) {
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                mr.v[i][j] = m1.v[i][j] * c;
            }
        }
    }
}

