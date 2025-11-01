package FunctionalInterface.InheritanceFunctionInterface;

@FunctionalInterface
public interface Kid extends Parent{

    @Override
    public void sayHello();

    default void sayBye(){
        // default method
    };

    default void sayGood(){
        // default method write n numbers as per used cases
    };
}

