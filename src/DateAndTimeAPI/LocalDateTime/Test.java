package DateAndTimeAPI.LocalDateTime;

import java.time.LocalDateTime;

/**
 * LocalDateTime: Represents a date and time without a time zone
 */
public class Test {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
//        System.out.println("now = " + now);

        LocalDateTime CostumeDateTime = LocalDateTime.of(2020, 8, 3, 12, 34, 56);
//        System.out.println("CostumeDateTime = " + CostumeDateTime);

        LocalDateTime parse = LocalDateTime.parse("2020-01-11T13:12:23");
        System.out.println("parse = " + parse);
    }
}
