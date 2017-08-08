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

    public void move() {
        System.out.println("Движется");
    }

    public void talk() {
        System.out.println("Говорит");
    }

    public void print() {
        System.out.printf("Фамилия Имя Отчество %1$20s%n" + "Возраст              %2$d%n", this.getFullName(), this.getAge());
    }
}


