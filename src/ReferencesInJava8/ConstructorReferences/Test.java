package ReferencesInJava8.ConstructorReferences;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mohsin","Haider","Devil");

        // using lambda expression
        List<Student> students = names.stream().map(x-> new Student(x)).collect(Collectors.toList());
        System.out.println("students = " + students);


        // Constructor References
        List<Student> studentList = names.stream().map(Student::new).collect(Collectors.toList());
        System.out.println("studentList = " + studentList);
    }
}
