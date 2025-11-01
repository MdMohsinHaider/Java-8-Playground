package FunctionalInterface.DefaultMethodsOverride;

@FunctionalInterface
public interface Parent {

    // Abstract method
    public void greeting();

    default void sayHello(){
        // default method body
        System.out.println("Hello");
    }
}
