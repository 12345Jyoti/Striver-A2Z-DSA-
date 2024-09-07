package queue;

import linkedList111.Node;




class QueueLL{
   Node start, end;
    int size=0;


    void push(int x ){
        Node temp=new Node(x);
        if(start==null){
            start=end=temp;
        }
        else end.next=temp;
        System.out.println(x+" Inserted into Queue ");
        size++;
    }

    void pop(){
        if(start==null) System.out.println("Empty");

        System.out.println(start.data);
        Node temp=start;
        start=start.next;
        size--;
    }

    int top(){
        if(start==null) {
            return -1;
        }
        System.out.println(start.data);
        return start.data;
    }

    int size(){
        System.out.println("size of queue is: "+size);
        return size;
    }
}



public class QueueUsingLL {
    public static void main(String[] args) {
        QueueLL queueLL=new QueueLL();
        queueLL.push(12);
        queueLL.push(11);
        queueLL.push(19);
        queueLL.push(16);
        queueLL.pop();
        queueLL.pop();
        queueLL.top();
        queueLL.size();
    }


}
