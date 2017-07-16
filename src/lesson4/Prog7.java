package lesson4;

public class Prog7 {
    public static void main(String args[]) {
        int n = 1;
        do {
            if (n % 5 == 0)
                System.out.println("Делится на 5 : " + n);
            n++;
        } while (n < 101);
    }
}
