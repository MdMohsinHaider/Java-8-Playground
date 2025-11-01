package FunctionalInterface.DefaultMethodExample;

public interface A {
    default void sayHello(){
        System.out.println("A Says Hello");
    }
}
