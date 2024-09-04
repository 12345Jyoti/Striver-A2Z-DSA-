package pc;

import java.util.LinkedList;

public class Comp {

    LinkedList<Integer> list=new LinkedList<>();

    int capacity=2;

    public void produce() throws InterruptedException{

        int val=0;
        while (true){
            synchronized (this){

                while (list.size()==capacity)
                    wait();

                System.out.println("Producer Produce -"+val);
                list.add(val++);
                notify();

                Thread.sleep(1000);
            }
        }


    }

    public void consume() throws InterruptedException{

        while(true){
            synchronized (this){

                while (list.size()==0){
                    wait();
                }
                int val=list.removeFirst();

                System.out.println("Consumer Consumed-"+val);
                notify();

                Thread.sleep(1000);

            }
        }
    }
}
