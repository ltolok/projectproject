package lesson14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindrome {
    public static void main(String[] args) {
        String s = "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554";
        String regex = "[1-5]+\\d";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            StringBuilder sb = new StringBuilder();
            sb.append(matcher.group());
            String substr = sb.toString();
            String reverseSubstr = sb.reverse().toString();

            if (substr.compareToIgnoreCase(reverseSubstr) == 0) {
                System.out.println("В строке \"" + s + " подстрока  " + substr + "  является палиндромом.");
            } else {
                System.out.println("В строке \"" + s + " подстрока  " + substr + "  не является палиндромом.");
            }
        }

    }
}