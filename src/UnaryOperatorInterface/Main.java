package UnaryOperatorInterface;

import java.util.Locale;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        // UnaryOperatorInterface
        UnaryOperator<Integer> unaryOperator = x -> x*x;
        System.out.println("unaryOperator = " + unaryOperator.apply(2));

        UnaryOperator<String> stringUnaryOperator = x -> x.toUpperCase(Locale.ROOT);
        System.out.println("stringUnaryOperator = " + stringUnaryOperator.apply("Mohsin"));

        UnaryOperator<Character> characterUnaryOperator = c -> c.charValue();
        System.out.println("characterUnaryOperator = " + characterUnaryOperator.apply('h'));
    }
}
