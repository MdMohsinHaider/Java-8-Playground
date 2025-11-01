package FunctionalInterface.DefaultMethodExample;

public interface B {
    default void sayHello(){
        System.out.println("B Says Hello");
    }
}
