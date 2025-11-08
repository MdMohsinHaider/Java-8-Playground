package FunctionlInterfaceJava8.FunctionChaining;

import java.util.function.Function;

public class Example {
    public static void main(String[] args) {
        Function<Integer,Integer> function1 = y -> 2*y;
        Function<Integer,Integer> function2 = a -> a*a*a;

        System.out.println("function1.andThen(function2) = " + function1.andThen(function2).apply(2)); // 64
        System.out.println("function2.andThen(function1) = " + function2.andThen(function1).apply(2)); // 16
        System.out.println("function1.compose(function2) = " + function1.compose(function2).apply(2)); // 16

        Function<String, String> function = Function.identity();
        System.out.println(function.apply("Mohsin"));
    }
}
