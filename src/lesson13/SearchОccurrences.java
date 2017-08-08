package lesson13;

public class SearchОccurrences {
    public static void main(String[] args) {
        String s = "Object oriented programming  is a programming paradigm based on the concept of objects.";
        String s1 = s.replaceAll("Object oriented programming", "ООP");
        System.out.println(s);
        System.out.println(s1);
    }
}
