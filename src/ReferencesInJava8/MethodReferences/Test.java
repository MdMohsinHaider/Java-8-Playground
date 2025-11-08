package ReferencesInJava8.MethodReferences;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void print(String string){
        System.out.println("string = " + string);
    }

    public static void main(String[] args) {
        List<String> students = Arrays.asList("Mohsin","Haider","Devil");
//        students.forEach(x -> System.out.println(x));

        // Lambda Expression replace with Method References
        students.forEach(Test::print);
    }
}
