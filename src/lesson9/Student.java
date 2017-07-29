package lesson9;

public class Student {
    private String firstName, lastName, group;
    private double sum;

    public Student(String a, String b, String g, double c) {
        firstName = a;
        lastName = b;
        group = g;
        sum = c;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getSum() {
        return sum;
    }

    public void setFirstName(String firstName) {
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

    public static void main(String[] args) {
        Student[] st = new Student[2];
        st[0] = new Student("Владимир", "Петров", "Группа 3", 0);
        st[1] = new Aspirant("Владимир", "Вовк", "Группа 3A", 0, "Научная работа аспиранта");
        for (Student student : st) {
            student.getScholarship();
            student.print();
        }
    }

    void print() {
        System.out.println(firstName + " " + lastName + "   " + group + "      Стипендия  " + getScholarship());
    }

    double getScholarship() {
        return 1100;
    }
}



