package FunctionalInterface.DefaultMethodsOverride;

public class Children implements Parent {

    @Override
    public void greeting() {
        System.out.println("Hello I am Child");
    }

    @Override
    public void sayHello(){
//        Parent.super.sayHello();
        System.out.println("Child says hello");
     }
}
