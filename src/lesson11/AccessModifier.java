package lesson11;

public class AccessModifier {
    private String s1 = "private";
    String s2 = "default";
    protected String s3 = "protected";
    public String s4 = "public";

    public void main(String[] args) {
        m1(s1);
        m1(s2);
        m1(s3);
        m1(s4);
    }

    public void m1(String s) {
        System.out.println(s);
    }
}
