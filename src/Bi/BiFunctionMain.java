package Bi;

import java.util.function.BiFunction;

public class BiFunctionMain {
    public static void main(String[] args) {

        // BiFunction
        BiFunction<String, String, Integer> biFunction = (a,b)-> a.length()+b.length();
        System.out.println("biFunction = " + biFunction.apply("Mohsin","Haider"));
    }
}
