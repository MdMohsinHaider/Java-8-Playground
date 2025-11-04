package FunctionlInterfaceJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Function<String, Integer> function = x -> x.length();
//        System.out.println("function = " + function.apply("Mohsin"));

        Function<String, String> function1 = s->s.substring(0,3);
//        System.out.println("function1 = " + function1.apply("Mohsin"));

        Function<List<Student>,List<Student>> studentsWithVipAsPerPrefix = li ->{
            List<Student> studentListResult = new ArrayList<>();
            for (Student student : li){
                if (function1.apply(student.getName()).equalsIgnoreCase("vip")){
                    studentListResult.add(student);
                }
            }
            return studentListResult;
        };

        Student s1 = new Student(101,"Mohsin");
        Student s2 = new Student(102,"VipMohsin");
        Student s3 = new Student(103,"VIPDevilVip");
        Student s4 = new Student(104,"VipHaider");
        Student s5 = new Student(105," MohsiVipn");

        List<Student> students = Arrays.asList(s1,s2,s3,s4,s5);

        List<Student> filteredStudent = studentsWithVipAsPerPrefix.apply(students);
        System.out.println("filteredStudent = " + filteredStudent);
    }
}
