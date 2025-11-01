package CreateThreadUsingLambdaExpression;

public class Main {
    public static void main(String[] args) {
//        MyClass myClass = new MyClass();
//        Thread thread = new Thread(myClass);
//        thread.start();
////        thread.run();




        // Lambda Expression used
        // one
        Runnable runnable = () -> {
            for (int i = 0; i <10 ; i++) {
                System.out.println("Hello "+i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };


        // two
        Runnable runnable1 = ()-> {
            for (int i = 0; i <10 ; i++) {
                System.out.println("Bye "+i);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };


        // First Thread
        Thread childThread1 = new Thread(runnable);
        childThread1.start();

        // First Thread
        Thread childThread2 = new Thread(runnable1);
        childThread2.start();
    }
}
