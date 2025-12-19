package StreamsApi.WhyStream;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        // imperative approach
        int []array = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]%2 == 0){
                sum +=array[i];
            }
        }
        System.out.println("sum = " + sum);


        // By Stream
        int []arr = {1,2,3,4,5};
        int sum1 = Arrays.stream(arr).filter(n-> n%2 == 0).sum();
        System.out.println("sum1 = " + sum1);

    }
}
