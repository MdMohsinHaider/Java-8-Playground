package StreamsApi.OprationOnStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        // part 1.
//        List<Integer> list = Arrays.asList(1, 2, 3, 5, 6, 78, 6, 7, 9, 6, 4,4, 83, 57, 7, 98, 55, 86);
//        List<Integer> filteredList = list.stream()
//                .filter(x -> x % 2 == 0)
//                .map(x -> x / 2)
//                .distinct()
//                .sorted((a,b)->(b-a))
//                .limit(4)
//                .skip(1)
//                .collect(Collectors.toList());
//        System.out.println("filteredList = " + filteredList);


        // part 2.
//        List<Integer> integerList = Stream.iterate(0,x->x+1)
//                .limit(101)
//                .skip(1)
//                .filter(x->x%2 ==0)
//                .map(x->x/10)
//                .distinct()
//                .sorted()
//                .peek(System.out::println)
//                .collect(Collectors.toList());
//        System.out.println("integerList = " + integerList);


        // part 3.
//        Integer integer = Stream.iterate(0, x -> x + 1)
//                .limit(101)
//                .map(x -> x / 20)
//                .distinct()
//                .peek(System.out::println)
//                .min((a, b) -> (b-a))
//                .get();
//        System.out.println("integer = " + integer);


        // part 4.
//        long integer1 = Stream.iterate(0, x -> x + 1)
//                .limit(101)
//                .map(x -> x / 20)
//                .distinct()
//                .count();
//        System.out.println("integer = " + integer1);


        // part 5. >> Multithreading or chunks uses cases
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        list.parallelStream();



        List<Integer> testData = IntStream.range(0, 10000000)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> parallelStream = testData
                .parallelStream()
                .filter(x->x%2 ==0)
                .map(x->(2*(x+10)-1+(20/3)))
                .sorted((a,b)->(b-a))
                .collect(Collectors.toList());
        System.out.println("parallelStream = " + parallelStream);

        long count = parallelStream.stream().count();
        System.out.println("count = " + count);
    }
}
