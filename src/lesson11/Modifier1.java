package lesson11;

public class Modifier1 extends AccessModifier {
    public static void main(String[] args) {
        AccessModifier am = new Modifier1();
        //am.m1(am.s1);
        am.m1(am.s2);
        am.m1(am.s3);
        am.m1(am.s4);
    }
}

