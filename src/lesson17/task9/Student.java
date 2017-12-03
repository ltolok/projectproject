package lesson17.task9;

import java.util.Arrays;

public class Student {
    private String name;
    private int group;
    private int course;
    private int[] evaluated = new int[10];

    public Student(String name, int group, int course, int[] evaluated) {
        this.name = name;
        this.group = group;
        this.course = course;
        System.arraycopy(evaluated, 0, this.evaluated, 0, evaluated.length);
    }

    @Override
    public String toString() {
        return "Cтудент  " + name +
                ", группа " + group +
                ", курс =" + course +
                ", оценки =" + Arrays.toString(evaluated);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (group != student.group) return false;
        if (course != student.course) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return Arrays.equals(evaluated, student.evaluated);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + group;
        result = 31 * result + course;
        result = 31 * result + Arrays.hashCode(evaluated);
        return result;
    }

    public int[] getEvaluated() {
        return evaluated;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setEvaluated(int[] evaluated) {
        this.evaluated = evaluated;
    }

    public double average() {
        double average = 0;
        int n = this.getEvaluated().length;
        for (int i = 0; i < n; i++) {
            average = average + this.getEvaluated()[i];
        }
        return average / n;
    }
}
