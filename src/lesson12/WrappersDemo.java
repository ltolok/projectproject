package lesson12;

public class WrappersDemo {
    public static void main(String[] args) {
        Double s5 = 12345.67;
        Double s1 = new Double(123456.1234);
        Double s2 = new Double("123456.1234");
        Double s3 = Double.valueOf("123456.1234");
        Double s4 = Double.parseDouble("123456.1234");
        String d = Double.toString(123456.1234);
        System.out.println("Класс Double");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(d);

        Float f1 = new Float(12.34f);
        Float f2 = new Float("12.34f");
        Float f3 = Float.valueOf(12.34f);
        Float f4 = Float.valueOf("12.34f");
        Float f5 = Float.parseFloat("12.34");
        String f6 = Float.toString(1234.1234f);
        Double f7=12.34;
        System.out.println("Класс Float");
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);
        System.out.println(f6);
        System.out.println(f7);

        Long l1 = new Long((long) 1111111111111111l);
        Long l2 = new Long("222222222222222");
        Long l3 = Long.valueOf("88888888888888");
        Long l4 = Long.parseLong("7777777777");
        String l5 = Long.toString((long) 5555555555555l);
        Long l6=1234567890l;
        System.out.println("Класс Long");
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        System.out.println(l5);
        System.out.println(l6);
        Integer i1 = new Integer(1);
        Integer i2 = new Integer("2");
        Integer i3 = Integer.valueOf("123");
        Integer i4 = Integer.parseInt("1234");
        String i5 = Integer.toString(12345);
        Integer i6=12345;
        System.out.println("Класс Integer");
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);

        Byte b1 = new Byte((byte) 1);
        Byte b2 = new Byte("2");
        Byte b3 = Byte.valueOf("3");
        String b4 = Byte.toString((byte) 4);
        Byte b5 = Byte.parseByte("123");
        Byte b6=4;
        System.out.println("Класс Byte");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);

        Short sh1 = new Short((short) 32000);
        Short sh2 = new Short("32001");
        Short sh3 = Short.valueOf("32002");
        Short sh4 = Short.parseShort("32003");
        String sh5 = Short.toString((short) 32004);
        Short sh6=32000;
        System.out.println("Класс Short");
        System.out.println(sh1);
        System.out.println(sh2);
        System.out.println(sh3);
        System.out.println(sh4);
        System.out.println(sh5);
        System.out.println(sh6);

        Character ch = new Character('A');
        Character ch1 = Character.valueOf('B');
        System.out.println("Класс Character");
        System.out.println(ch);
        System.out.println(ch1);

        Boolean a = new Boolean(true);
        Boolean a1 = Boolean.valueOf("false");
        String a2 = Boolean.toString(true);
        System.out.println("Класс Boolean ");
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
    }
}