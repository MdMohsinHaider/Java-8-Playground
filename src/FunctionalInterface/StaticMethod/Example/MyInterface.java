package FunctionalInterface.StaticMethod.Example;

public interface MyInterface {
    public static void main(String[] args) {
        System.out.println("Hello from Interface");
        MyInterface myInterface = new MyClass();
        myInterface.test();

        MyClass myClass = new MyClass();
        myClass.get();

    }

    default void test(){
        System.out.println("hello");
    }
}
