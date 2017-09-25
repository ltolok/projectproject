package lesson13;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;

public class FullReport {
    public static void generateFullReport(Employee employee[], String country, String language) throws UnsupportedEncodingException {
        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("report", current);
        for (String key : rb.keySet()) {
            String value = rb.getString(key);
            System.out.println();
            value = new String(value.getBytes("ISO-8859-1"), "cp1251");
            System.out.println(value);
        }
        DateFormat format1 = new SimpleDateFormat("dd.MM.yy");
        System.out.println("\t\t Платежная ведомость от  " + format1.format(Employee.getSalaryDate()));
        System.out.printf("" + "№ Фамилия Имя Отчество             Cумма    ");
        for (Employee employee1 : employee) {
            System.out.printf("%n%d  %-30s%10.2f", Arrays.asList(employee).indexOf(employee1) + 1, employee1.getFullname(), employee1.getSalary());
        }
    }
}
