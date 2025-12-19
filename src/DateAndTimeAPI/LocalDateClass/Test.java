package DateAndTimeAPI.LocalDateClass;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/**
 * LocalDate: Represents a date without a time zone.
 */
public class Test {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
//        System.out.println("now = " + now);

        int month = now.getDayOfMonth();
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        int dayOfYear = now.getDayOfYear();
        Month month1 = now.getMonth();
        int year = now.getYear();

        System.out.println("month = " + month);
        System.out.println("dayOfWeek = " + dayOfWeek);
        System.out.println("dayOfYear = " + dayOfYear);
        System.out.println("month1 = " + month1);
        System.out.println("year = " + year);

        LocalDate customDate = LocalDate.of(2001,10,29);
//        System.out.println("customDate = " + customDate);
    }
}
