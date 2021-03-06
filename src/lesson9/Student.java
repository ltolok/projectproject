package lesson9;

public class Student {
    private String firstName, lastName, group;

    public Student(String a, String b, String g) {
        firstName = a;
        lastName = b;
        group = g;
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

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group='" + group + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (firstName != null ? !firstName.equals(student.firstName) : student.firstName != null) return false;
        if (lastName != null ? !lastName.equals(student.lastName) : student.lastName != null) return false;
        return group != null ? group.equals(student.group) : student.group == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (group != null ? group.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        Student[] st = new Student[4];
        st[0] = new Student("Владимир", "Петров", "Группа 1");
        st[1] = new Student("Александр", "Кривцов", "Группа 2");
        st[2] = new Aspirant("Олег", "Вовк", "Группа 1A", "Научная работа аспиранта Вовк");
        st[3] = new Aspirant("Алексей", "Иванов", "Группа 3A", "Научная работа аспиранта Иванова Алексея");
        for (Student student : st) {
            student.print();
        }
    }

    void print() {
        System.out.println(toString() + ",  Scholarship= " + getScholarship() + "}");
    }

    public double getScholarship() {
        return 1100;
    }
}



