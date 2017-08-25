package lesson12;

import lesson11.AccessModifier;

public class Modifier3 extends AccessModifier {
    public static void main(String[] args) {
        //new Modifier3().m1(new AccessModifier().s1);
        //new Modifier3().m1(new AccessModifier().s2);
        new Modifier3().m1(new Modifier3().s3);
        new Modifier3().m1(new AccessModifier().s4);
    }
}
