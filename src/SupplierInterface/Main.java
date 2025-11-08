package SupplierInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier<Integer> integerSupplier = ()-> 1;
        System.out.println("integerSupplier = " + integerSupplier.get());

        // recall All The Functional Interfaces in Java 8
        Predicate<Integer> predicate = x -> x%2 ==0; // return boolean
        Function<Integer,Integer> function = x -> x*x; // return work output
        Consumer<Integer> consumer = x -> System.out.println("x = " + x);
        Supplier<Integer> supplier = ()-> 100;

        // for else
        Supplier<String> stringSupplier = ()-> "Odd value";
        Consumer<String> stringConsumer = z -> System.out.println("z = " + z);

        // All are used together
        if (predicate.test(supplier.get())) consumer.accept(function.apply(supplier.get()));
        else stringConsumer.accept(stringSupplier.get());
    }
}
