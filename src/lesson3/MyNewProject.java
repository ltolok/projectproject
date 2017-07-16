package lesson3;

public class MyNewProject {
    public static void main(String[] args) {
        convByte();
        convShort();
        convChar();
        convInt();
        convLong();
        convFloat();
        convDouble();
    }

    public static void convByte() {
        System.out.println("Преобразование переменной типа byte  ");
        byte a = 127;
        short b = a;
        System.out.println(b);
        a = 126;
        char c = (char) a;
        System.out.println(c);
        int d = a;
        System.out.println(d);
        a = 125;
        long e = a;
        System.out.println(e);
        a = 124;
        float g = a;
        System.out.println(g);
        a = 123;
        double i = a;
        System.out.println(i);
    }

    public static void convShort() {
        System.out.println("Преобразование переменной типа short");
        short a = 32767;
        byte b = (byte) a;
        System.out.println(b);
        char c = (char) a;
        System.out.println(c);
        int d = a;
        System.out.println(d);
        long e = a;
        System.out.println(e);
        float g = a;
        System.out.println(g);
        double i = a;
        System.out.println(i);
    }

    public static void convChar() {
        System.out.println("Преобразование переменной типа char");
        char a = 'Q';
        byte b = (byte) a;
        System.out.println(b);
        short c = (short) a;
        System.out.println(c);
        int d = a;
        System.out.println(d);
        long e = a;
        System.out.println(e);
        float g = a;
        System.out.println(g);
        double i = a;
        System.out.println(i);
        char k = a;
        System.out.println(k);
    }

    public static void convInt() {
        System.out.println("Преобразование переменной типа int");
        int a = 33000;
        byte b = (byte) a;
        System.out.println(b);
        short c = (short) a;
        System.out.println(c);
        char d = (char) a;
        System.out.println(d);
        long e = a;
        System.out.println(e);
        float g = a;
        System.out.println(g);
        double i = a;
        System.out.println(i);
    }

    public static void convLong() {
        System.out.println("Преобразование переменной типа long");
        long a = 1000000000;
        byte b = (byte) a;
        System.out.println(b);
        short c = (short) a;
        System.out.println(c);
        char d = (char) a;
        System.out.println(d);
        int e = (int) a;
        System.out.println(e);
        float g = a;
        System.out.println(g);
        double i = a;
        System.out.println(i);
    }

    public static void convFloat() {
        System.out.println("Преобразование переменной типа float");
        float a = 12001300.123f;
        byte b = (byte) a;
        System.out.println(b);
        short c = (short) a;
        System.out.println(c);
        char d = (char) a;
        System.out.println(d);
        int e = (int) a;
        System.out.println(e);
        double g = a;
        System.out.println(g);
        long i = (long) a;
        System.out.println(i);
    }

    public static void convDouble() {
        System.out.println("Преобразование переменной типа double");
        double a = 123456789.123;
        byte b = (byte) a;
        System.out.println(b);
        short c = (short) a;
        System.out.println(c);
        char d = (char) a;
        System.out.println(d);
        int e = (int) a;
        System.out.println(e);
        float g = (float) a;
        System.out.println(g);
        long i = (long) a;
        System.out.println(i);
    }
}