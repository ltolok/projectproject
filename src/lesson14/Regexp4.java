package lesson14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp4 {
    public static void main(String[] args) {
        int k = 0;
        String s = "Допустимые идентификаторы: MinTemp, sum, x, $test, my_number.";
        String regex = "[A-z]+|\\w";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            k++;
        }
        System.out.printf("В строке : \" %s\"\nколичество слов, содержащих только символы латинского алфавита равно %s.", s, k);
    }
}
