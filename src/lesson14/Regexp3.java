package lesson14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp3 {
    public static void main(String[] args) {
        String s = "Допустимые идентификаторы: MinTemp, sum, xx4, $test, my_number.";
        String regex = "[^:;,.$\\s]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        int minLength = 999;
        String strMinLength= new String();
        while (matcher.find()) {
            String str = matcher.group();
            if (minLength >= str.length()) {
                strMinLength = str;
                minLength = str.length();
                char c[] = str.toCharArray();
                for (int i = 0; i < minLength - 1; i++) {
                    if (c[i] == c[i + 1]) {
                        minLength--;
                    }
                }
            }
        }
        System.out.printf("В строке  \"%s\" \n", s);
        System.out.printf("первое слово, в котором число различных символов минимально (%s) это %s", minLength, strMinLength);
    }
}