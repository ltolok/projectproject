package lesson14;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Holidays {
    public static void main(String[] args) {
        DateFormat format1 = new SimpleDateFormat("dd.MM.yy");
        GregorianCalendar newYear = new GregorianCalendar(2017, Calendar.JANUARY, 1);
        GregorianCalendar internationalWomenDay = new GregorianCalendar(2017, Calendar.MARCH, 8);
        GregorianCalendar solidarityDay = new GregorianCalendar(2017, 04, 1);
        GregorianCalendar dayVictory = new GregorianCalendar(2017, 04, 9);
        GregorianCalendar constitutionDay = new GregorianCalendar(2017, 05, 28);
        GregorianCalendar independenceDay = new GregorianCalendar(2017, 07, 24);
        System.out.printf("\t\tКалендарь праздников на 2017 год%n");
        System.out.printf("Новый год%42s%n", format1.format(newYear.getTime()));
        System.out.printf("Международный женский день 8 Марта%17s%n", format1.format(internationalWomenDay.getTime()));
        System.out.printf("День международной солидарности трудящихся %1s%n", format1.format(solidarityDay.getTime()));
        System.out.printf("День победы%40s%n", format1.format(dayVictory.getTime()));
        System.out.printf("День конституции%35s%n", format1.format(constitutionDay.getTime()));
        System.out.printf("День независимости%33s%n", format1.format(independenceDay.getTime()));
    }
}

