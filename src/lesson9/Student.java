package lesson9;

public class Student {
    public String firstName, lastName;
    public String group;
    public double sum;

    public void setFirstName(String fullName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public Student(String a, String b, String g, double c) {
        this.firstName = a;
        this.lastName = b;
        this.group = g;
        this.sum = c;
    }

    public static void main(String[] args) {
        Student st1 = new Student("Иван", "Иванов", "Группа 1", 1100);
        System.out.print("Студент");
        st1.print();
        System.out.print("Аспирант  ");
        Student st2 = new Aspirant("Петр", "Петров", "Группа 1а", 1200, "Тема научной работы HHHHQQQEEECCC");
        st2.print();
    }

    void print() {
        System.out.println("    " + this.firstName + " " + this.lastName + "  " + this.group + "Стипендия  " + this.sum);
    }

    double getScholarship() {
        return 1100;
    }

}

