package lesson8;

public class Person {
    private String fullName;
    private int age;

    public Person(String name, int a) {
        this.fullName = name;
        this.age = a;
    }

    public Person() {
    }

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

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFullName("Петров Петр Петрович");
        person1.setAge(25);
        person1.print();
        person1.move();
        person1.talk();
        Person person2 = new Person("Иванов Иван Иванович", 30);
        person2.print();
        person2.move();
        person2.talk();
    }

    void move() {
        System.out.println("Движется");
    }

    void talk() {
        System.out.println("Говорит");
    }

    void print() {
        System.out.println("ФИО    " + this.getFullName());
        System.out.println("Возраст     " + this.getAge());
    }
}


