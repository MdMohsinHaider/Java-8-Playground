package BinaryOperatorInterface;

import java.util.Locale;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {

        // BinaryOperator Interface
        BinaryOperator<Integer> binaryOperator = (a,b)-> a+b;
        System.out.println("binaryOperator = " + binaryOperator.apply(12,8));

        BinaryOperator<String> stringBinaryOperator = (s1,s2)->(s1+" "+s2).toUpperCase(Locale.ROOT);
        System.out.println("stringBinaryOperator = " + stringBinaryOperator.apply("Mohsin","Haider"));
    }
}
