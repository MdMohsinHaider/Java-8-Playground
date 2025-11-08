package FunctionlInterfaceJava8.FunctionChaining;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String,String> function1 = s-> s.toUpperCase();
        Function<String,String> function2 = s -> s.substring(0,3);

        // default method
        System.out.println(function1.andThen(function2).apply("Mohsin haider"));

    }
}
