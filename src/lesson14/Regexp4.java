package lesson14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp4 {
    static int k = 0;

    public static void main(String[] args) {
        String s = "Допустимые идентификаторы: MinTemp, sum, x, $test, my_number.";
        String regex = "[^:,;,.,,,\\s\\d][A-z]+|\\w";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            k++;
        }
        System.out.println("В строке :  \"" + s + "\"" + "  - количество слов, содержащих только символы латинского алфавита равно " + k);
    }
}
