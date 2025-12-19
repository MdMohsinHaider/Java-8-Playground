package DateAndTimeAPI.Instant;

import java.time.Instant;
import java.util.Optional;

/**
 * Instant: Represents an instantaneous point on the timeline, typically used for machine timestamps.
 */
public class Test {
    public static void main(String[] args) {

        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        Instant instantNow = Instant.now();
        System.out.println("instantNow = " + instantNow);

        long epochSecond = instantNow.getEpochSecond();
        System.out.println("epochSecond = " + epochSecond);
    }
}
