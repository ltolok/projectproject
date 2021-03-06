package lesson17.task9;

import java.util.*;

public class StudentsList {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Морозов Иван", 101, 1, new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5}));
        Student student1 = new Student("Федоров Михаил", 102, 1, new int[]{4, 4, 4, 4, 5, 3, 3, 3, 3, 3});
        studentList.add(student1);
        Student student2 = new Student("Петров Владимир", 202, 2, new int[]{3, 3, 4, 4, 5, 3, 3, 3, 3, 3});
        studentList.add(student2);
        Student student3 = new Student("Ковалева Ирина", 202, 2, new int[]{5, 5, 4, 4, 5, 4, 4, 4, 4, 3});
        studentList.add(student3);
        Student student4 = new Student("Александров Артем", 301, 3, new int[]{2, 3, 3, 3, 3, 3, 3, 3, 3, 3});
        studentList.add(student4);
        Student student5 = new Student("Гончарова Татьяна", 301, 3, new int[]{5, 5, 4, 4, 5, 5, 3, 3, 3, 3});
        studentList.add(student5);
        for (Student student : studentList) {
            System.out.println(student);
            System.out.print("Средний балл студента  " + student.getName() + "  = " + student.average());
            if (student.average() >= 3) {
                student.setCourse(student.getCourse() + 1);
                System.out.println(" (Переводится на следующий курс)");
                System.out.println();
            } else {
                student.setCourse(0);
                System.out.println(" (Отчисляется)");
                System.out.println();
            }
        }
        printStudents(studentList, 1);
        printStudents(studentList, 2);
        printStudents(studentList, 3);
        printStudents(studentList, 4);
    }

    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        System.out.println("Список студентов " + course + " курса:");
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}