package ComparatorUsingLambdaExpression;

import java.util.Comparator;

public class MyClass implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
//        return a-b; // ascending order
        return b-a; // descending order
    }
}
