package pc;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        final Comp comp=new Comp();

        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    comp.produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                ;
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    comp.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }
}
