package lesson9;

public class Recursion {
    public static void main(String[] args) {
        print(1, 7);
    }

    public static void print(int a, int b) {
        System.out.println(a);
        if (a > b) {
            if (a != b) {
                print(a - 1, b);
            }
        } else {
            if (a < b) {
                print(a + 1, b);
            }
        }
    }
}

