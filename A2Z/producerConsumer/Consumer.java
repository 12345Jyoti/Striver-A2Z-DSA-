package producerConsumer;

public class Consumer extends Thread{

    Company c;
    Consumer(Company c){
        this.c=c;
    }

    @Override
    public void run() {
        int i=1;
        while(true){
            try {
                this.c.consumeItem(i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(2000);
            }catch (Exception e){}
        }
    }
}
