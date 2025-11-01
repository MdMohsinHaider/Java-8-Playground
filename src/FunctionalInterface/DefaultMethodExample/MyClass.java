package FunctionalInterface.DefaultMethodExample;

public class MyClass implements A, B {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.sayHello();
    }

    @Override
    public void sayHello() {
        A.super.sayHello();
        B.super.sayHello();
    }
}
