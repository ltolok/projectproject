package lesson11;

public class AccessModifier {
    private String s1 = "private";
    String s2 = "default";
    protected String s3 = "protected";
    public String s4 = "public";

    public void setS4(String s4) {
        this.s4 = s4;
    }

    public String getS4() {

        return s4;
    }

    public void setS3(String s3) {

        this.s3 = s3;
    }

    public String getS3() {

        return s3;
    }

    public void setS2(String s2) {

        this.s2 = s2;
    }

    public String getS2() {

        return s2;
    }

    public void setS1(String s1) {

        this.s1 = s1;
    }

    public String getS1() {

        return s1;
    }

    public static void main(String[] args) {
        AccessModifier am = new AccessModifier();
        am.m1(am.s1);
        am.m1(am.s2);
        am.m1(am.s3);
        am.m1(am.s4);
    }

    public void m1(String s) {
        System.out.println(s);
    }
}
