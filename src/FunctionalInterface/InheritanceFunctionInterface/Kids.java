package FunctionalInterface.InheritanceFunctionInterface;

@FunctionalInterface
public interface Kids extends Parent{

    // if same method write the method will be overridden
    @Override
    public void sayHello();
}
