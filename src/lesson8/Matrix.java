package lesson8;

import java.util.Scanner;

public class
Matrix {
    static int nl = 3;
    static int nc = 4;
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
        Matrix matrix1 = new Matrix();
        Matrix matrix2 = new Matrix();
        Matrix matrixsum = new Matrix(0);
        Matrix matrixmp = new Matrix(0);
        System.out.println("Матрица 1");
        matrix1.print();
        System.out.println("Матрица 2");
        matrix2.print();
        matrixsum.sum(matrix1, matrix2);
        System.out.println();
        System.out.println("Матрица 3 - результат суммирования ");
        matrixsum.print();
        System.out.println();
        System.out.print("Введите число: ");
        Scanner scn = new Scanner(System.in);
        double n = scn.nextDouble();
        matrixmp.multiply(matrix1, n);
        System.out.println("Матрица 4 - результат умножения " + "Матрица 1" + "   *   " + n);
        matrixmp.print();
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

    void sum(Matrix m1, Matrix m2) {
        if (m1.v.length == m2.v.length && m1.v[0].length == m2.v[0].length) {
            for (int i = 0; i < nl; i++) {
                for (int j = 0; j < nc; j++) {
                    this.v[i][j] = m1.v[i][j] + m2.v[i][j];
                }
            }
        } else {
            System.out.println("Матрицы разной размерности. Операция суммирования невозможна!");
        }
    }

    void multiply(Matrix m1, double c) {
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                this.v[i][j] = m1.v[i][j] * c;
            }
        }
    }
}

