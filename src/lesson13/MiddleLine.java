package lesson13;

public class MiddleLine {
    static String s[] = new String[]{"String", "code", "Practice"};

    public static void main(String[] args) {
        middle(s);
    }

    private static void middle(String s[]) {
        for (String s1 : s) {
            System.out.printf("  %1$s%2$s", s1.charAt(s1.length() / 2 - 1), s1.charAt(s1.length() / 2));
        }
    }
}