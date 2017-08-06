package lesson13;

public class MyLine {
    public static void main(String[] args) {
        String s = "I like Java!!!";
        String s2;
        mm(s);
        mm1(s);
        String s1 = "aoaoaoaoaoao";
        mm2(s1);
        mm3(s);
        mm4(s);
        int i = 3;
        int k = 56;
        StringBuilder sb = new StringBuilder(10);
        s2 = sb.append(i).append("+").append(k).append("=").append(i + k).toString();
        mm5(s2);
        StringBuilder sb1 = new StringBuilder(10);
        s2 = sb1.append(i).append("-").append(k).append("=").append(i - k).toString();
        mm5(s2);
        StringBuilder sb2 = new StringBuilder(10);
        s2 = sb2.append(i).append("*").append(k).append("=").append(i * k).toString();
        mm5(s2);
    }

    private static void mm(String s) {
        System.out.println(s.charAt(s.length() - 1));
        System.out.println(s.endsWith("!!!"));
        System.out.println(s.startsWith("I like"));
    }

    private static void mm1(String s) {
        System.out.println(s.indexOf("Java"));
    }

    private static void mm2(String s) {
        System.out.println(s);
        System.out.println(s.replace("a", "o"));
    }

    private static void mm3(String s) {
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
    }

    private static void mm4(String s) {
        System.out.println(s.substring(7, 11));
    }

    private static void mm5(String s2) {
        System.out.println(s2);
        System.out.println(s2.replace("=", " равно "));
    }
}