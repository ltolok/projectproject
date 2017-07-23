package lesson8;

public class Person {
    public String fullName;
    public int age;

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

    ;

    public Person() {
    }

    ;

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setFullName("Петров Петр Петрович");
        p1.setAge(25);
        p1.print();
        p1.move();
        p1.talk();
        Person p2 = new Person("Иванов Иван Иванович", 30);
        p2.print();
        p2.move();
        p2.talk();
    }

    void move() {
        System.out.println("Движется");
    }

    void talk() {
        System.out.println("Говорит");
    }

    void print() {
        System.out.println("Полное имя      " + this.getFullName());
        System.out.println("Возраст     " + this.getAge());
    }
}


