package UseLambdaExpression;

public class Main {
    public static void main(String[] args) {
//        Employee employee= new SoftwareEngineering();
//        System.out.println(employee.getName());

        // lambda Expression
        // if lambda Expression used then do not use SoftwareEngineering
        // direct implement by using lambda expression
        // functional interface hold lambda expression

        Employee employee = ()-> "software engineering";
        System.out.println(employee.getName());
    }
}
