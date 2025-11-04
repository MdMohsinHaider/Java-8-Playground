package ComparatorUsingLambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(25);
        list.add(7);
        list.add(34);
        list.add(56);
        list.add(78);
        list.add(12);
        list.add(90);
        list.add(43);
        list.add(66);
        System.out.println("list = " + list);
//        Collections.sort(list, new MyClass());

        // By using lambda expression, No need another implements class
        Collections.sort(list, (a,b)->b-a);
        System.out.println("list = " + list);
    }
}
