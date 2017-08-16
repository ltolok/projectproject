package lesson14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp3 {
    public static String strMinLengh;

    public static void main(String[] args) {
        String s = "Допустимые идентификаторы: MinTemp, sum, x4, $test, my_number.";
        String regex = "[^:,;,;.,$,_,\\s]+";
        int minLength = 999;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            if (minLength > matcher.group().length()) {
                minLength = matcher.group().length();
                strMinLengh = matcher.group();
            }
        }
        System.out.println("В строке  " + "\"" + s + "\"");
        System.out.println("первое слово, в котором число различных символов минимально " + "(" + minLength + ")" + " это  " + strMinLengh + ".");
    }
}
