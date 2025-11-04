package Predicates;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> salaryGraterThanOneLakh = x-> x>100000;
        System.out.println("salaryGraterThanOneLakh = " + salaryGraterThanOneLakh.test(20));

        Predicate<String> startWithLetterV = x -> x.toLowerCase().charAt(0) =='v';
        System.out.println("startWithLetterV = " + startWithLetterV.test("Hello"));


        // Default methods in predicates
        Predicate<String> endWithLetterL = x -> x.toLowerCase().charAt(x.length()-1) == 'l';
        System.out.println("endWithLetterL = " + endWithLetterL.test("Test"));
        Predicate<String> startAndEnd = startWithLetterV.and(endWithLetterL);
        System.out.println("and = " + startAndEnd.test("Vmart l"));
    }
}
