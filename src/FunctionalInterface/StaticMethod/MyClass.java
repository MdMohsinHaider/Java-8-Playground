package FunctionalInterface.StaticMethod;

public class MyClass implements A{
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
//        myClass.sayHello(); ❌
//        MyClass.sayHello(); ❌
        A.sayHello();
    }
}
