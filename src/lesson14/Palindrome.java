package lesson14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindrome {
    public static void main(String[] args) {
        String s = "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554";
        String regex = "[0-9]+\\d";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        System.out.println("В строке \"" + s + "\"");
        while (matcher.find()) {
            String substr = matcher.group();
            StringBuilder sb = new StringBuilder(substr);
            String reverseSubstr = sb.reverse().toString();
            if (substr.compareToIgnoreCase(reverseSubstr) == 0) {
                System.out.printf(" - подстрока %s является палиндромом.%n", substr);
            } else {
                System.out.printf(" - подстрока %s не является палиндромом.%n", substr);
            }
        }

    }
}