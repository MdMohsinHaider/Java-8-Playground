package ComparatorUsingLambdaExpression.Example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(100,"Mohsin");
        Student s2 = new Student(101,"Haider");
        Student s3 = new Student(102,"Devil");

        List<Student> l1 = new ArrayList<>();
        l1.add(s1);
        l1.add(s2);
        l1.add(s3);

        Collections.sort(l1,(a,b)->b.getId()-a.getId());
        System.out.println("l1 = " + l1);
    }
}
