package lesson14;

        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class Regexp3 {
    public static void main(String[] args) {
        String s = "Допустимые идентификаторы: MinTemp, sum, x4x4, $test, my_number.";
        String regex = "\\w+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        int minLength = 100;
        String strMinLength = "";
        while (matcher.find()) {
            if (matcher.group().length() < minLength) {
                minLength = matcher.group().length();
                strMinLength = matcher.group();
            }
            int length = new Regexp3().numberChar(matcher.group());
            if (length < minLength) {
                minLength = length;
                strMinLength = matcher.group();
            }
        }
        System.out.printf("В строке  \"%s\" \n", s);
        System.out.printf("первое слово, в котором число различных символов минимально (%s) это %s\n", minLength, strMinLength);
    }

    int numberChar(String s) {
        int length = s.length();
        char c[] = s.toCharArray();
        char c1[] = new char[length];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (c1[j] == c[i]) {
                    length--;
                    break;
                } else if (c1[j] == 0) {
                    c1[j] = c[i];
                    break;
                }
            }
        }
        return length;
    }
}