package lesson12;


import java.text.ParseException;

public class WrappersDemo {
    public static void main(String[] args) {
        Double s5 =12345.67;
        Double s1= new Double(123456.1234);
        Double s2= new Double("123456.1234");
        Double s3 = Double.valueOf("123456.1234");
        Double s4 = Double.parseDouble("456318647.123");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
