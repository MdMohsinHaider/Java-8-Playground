package DateAndTimeAPI.ZonedDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

/**
 * ZonedDateTime: Represents a date and time with a time zone.
 */
public class Test {
    public static void main(String[] args) {

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("now = " + now);

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//        availableZoneIds.forEach(System.out::println);

        ZonedDateTime costumeZonedDateTime = ZonedDateTime.of(2002, 3, 20, 14, 30, 30, 30, ZoneId.of("Europe/Nicosia"));
//        System.out.println("costumeZonedDateTime = " + costumeZonedDateTime);

        ZonedDateTime now1 = ZonedDateTime.now(ZoneId.of("Europe/Nicosia"));
        System.out.println("now1 = " + now1);
    }
}
