package lesson13;

public class MiddleLine {
    static String s[] = new String[]{"String", "code", "Practice"};

    public static void main(String[] args) {
        m(s);
    }

    private static void m(String s[]) {
        for (int i = 0;
             i < s.length; i++) {
            System.out.printf("  %1$s%2$s", s[i].charAt(s[i].length() / 2 - 1), s[i].charAt(s[i].length() / 2));
        }
    }
}