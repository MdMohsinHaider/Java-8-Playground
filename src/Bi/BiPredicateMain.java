package Bi;

import java.util.function.BiPredicate;

public class BiPredicateMain {
    public static void main(String[] args) {

        // BiPredicate
        BiPredicate<Integer,Integer> biPredicate = (x,y) -> x>y;
        System.out.println("biPredicate = " + biPredicate.test(12,34));
    }
}
