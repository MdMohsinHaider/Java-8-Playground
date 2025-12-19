package StreamsApi.CreateStream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        // 1. First way to create stream from Collection List
        List<String> list = Arrays.asList("apple","banana","cherry");
        Stream<String> myStream = list.stream();

        // 2. Second way to create stream from Array
        String[] array = {"apple","banana","cherry"};
        Stream<String> stream = Arrays.stream(array);

        // 3. Third way to create stream from Directly values stream
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

        // 4. Forth way to create stream from iterate method
        Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(10);

        // 5. fifth way to create stream from generate() method directly
        Stream<String> limit1 = Stream.generate(() -> "Mohsin").limit(10);
                        // or
        Stream<Integer> integerStream1 = Stream.generate(() -> (int) Math.random() * 100);
    }
}
