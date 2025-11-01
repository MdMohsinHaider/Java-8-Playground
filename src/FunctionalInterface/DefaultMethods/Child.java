package FunctionalInterface.DefaultMethods;

public class Child implements Parent{

    @Override
    public void greeting() {
        System.out.println("Hello I am Child");
    }
}
