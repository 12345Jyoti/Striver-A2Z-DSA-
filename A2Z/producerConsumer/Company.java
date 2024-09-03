package producerConsumer;

public class Company {
    
    int n;
    boolean f=false;
    
    synchronized public void produceItem(int n) throws Exception{
        
        if(f){
            wait();
        }
        this.n=n;
        System.out.println("Producer : "+this.n);
        f=true;
        notify();
    }
    
    synchronized public int consumeItem(int n) throws Exception{
        if(!f){
            wait();
        }
        System.out.println("Consumer :"+this.n);
        f=false;
        notify();
        return this.n;
    }
}
