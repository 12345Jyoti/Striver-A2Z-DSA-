package javaEightFeatures.lambdaFun;

public class ThreadDemo {


    static Runnable runnable=()->{
        for (int i = 1; i <= 10; i++) {
            System.out.println("The value of i is : "+i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }

    };

    public static void main(String[] args) {
        Thread thread=new Thread(runnable);
        thread.setName("John");
        thread.start();
        thread.getName();
        System.out.println(thread.getName());

    }
}
