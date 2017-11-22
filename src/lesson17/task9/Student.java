package lesson17.task9;

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
}
