package lesson16.task5;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Repeat {
    public static void main(String[] args) {
        String s = "1, 2, 3, 4, 4, 5";
        String regex = "\\d";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        Set<Integer> s1 = new LinkedHashSet<>();
        while (matcher.find()) {
            s1.add(Integer.parseInt(matcher.group()));
        }
        System.out.println(s1);
    }
}