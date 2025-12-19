package OptionalClass;

import java.util.Optional;

public class Test {

    public static void main(String[] args) {
        Optional<String> name = getName(2);

        // First Way
        if (name.isPresent())
            System.out.println("name = " + name.get());

        // second way
        name.ifPresent(System.out::println);

        // third way
        name.ifPresentOrElse(System.out::println,() -> System.out.println("name  = " + name));
    }

    private static Optional<String> getName(int id){
//        String name = "Mohsin";
//        String name = null;

//        return Optional.of(name); // code exception while value is null
//        return Optional.ofNullable(name); // if possible to be null the value
        return Optional.empty();
    }
}
