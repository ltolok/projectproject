package lesson13;

import java.util.Arrays;

public class Report {
    public static void generateReport(Employee employee[]) {
        System.out.printf("№ Фамилия Имя Отчество             Зарплата    ");
        for (Employee employee1 : employee) {
            System.out.printf("%n%d  %-30s%10.2f", Arrays.asList(employee).indexOf(employee1) + 1, employee1.getFullname(), employee1.getSalary());
        }
    }
}

