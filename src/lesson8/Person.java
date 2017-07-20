package lesson8;

public class Person {
    private String fullName;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {

        return age;
    }

    public String getFullName() {

        return fullName;
    }

    public void setFullName(String fullName) {

        this.fullName = fullName;
    }

    Person(String name, int a) {
        this.fullName = name;
        this.age = a;
    }

    Person() {
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setFullName("Петров Петр Петрович");
        p1.setAge(25);
        p1.print();
        Person p2 = new Person("Иванов Иван Иванович", 30);
        p2.print();


    }

    void move() {
    }

    void talk() {
    }

    void print() {
        System.out.println("Полное имя      " + this.getFullName());
        System.out.println("Возраст     " + this.getAge());
    }
}


