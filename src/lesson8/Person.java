package lesson8;

public class Person {
    String fullName;
    int age;

    Person() {
        System.out.println("Персона 1  создана ");
    }

    Person(String name, int a) {
        fullName = name;
        age = a;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.fullName = "Петров Петр Петрович";
        p1.age = 25;
        pr(p1.fullName, p1.age);
        Person p2 = new Person("Иванов Иван Иванович", 20);
        System.out.println("Персона 2  создана ");
        pr(p2.fullName, p2.age);
    }

    void move() {
    }

    void talk() {
    }

    static void pr(String n, int a) {
        System.out.println(n + "    " + a);
    }
}


