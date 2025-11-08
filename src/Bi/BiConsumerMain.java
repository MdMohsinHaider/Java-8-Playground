package Bi;

import java.util.function.BiConsumer;

public class BiConsumerMain {
    public static void main(String[] args) {

        // BiConsumer
        BiConsumer<String,String> biConsumer = (x,v)-> System.out.println("x + y : "+ x+" "+v);
        biConsumer.accept("Mohsin","Haider");
    }
}
