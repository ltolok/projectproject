package lesson11;

public class AccessModifier {
    static private String s = "private";
    static String s1 = "default";
    static protected String s2 = "protected";
    static public String s3 = "public";

    public static void main(String[] args) {
        m1(s);
        m1(s1);
        m1(s2);
        m1(s3);
    }

    public static void m1(String s) {
        System.out.println(s);
    }
}
