package DateAndTimeAPI.LocalTimeClass;

import java.time.LocalTime;

/**
 * LocalTime: Represents a time without a date or time zone
 */
public class Test {
    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
//        System.out.println("now = " + now);

        LocalTime costumeTime = LocalTime.of(2,43,56);
//        System.out.println("costumeTime = " + costumeTime);

        LocalTime parseTime = LocalTime.parse("15:30:45");
//        System.out.println("parseTime = " + parseTime);

        LocalTime minusHours = now.minusHours(1);
//        System.out.println("minusHours = " + minusHours);

        LocalTime minusMinutes = now.minusMinutes(1);
//        System.out.println("minusMinutes = " + minusMinutes);

        LocalTime minusSeconds = now.minusSeconds(1);
//        System.out.println("minusSeconds = " + minusSeconds);
    }
}
