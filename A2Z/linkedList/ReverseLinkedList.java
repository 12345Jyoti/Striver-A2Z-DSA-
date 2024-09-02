package linkedList;

public class ReverseLinkedList {
    Node head;

    private int size;
    ReverseLinkedList(){
        this.size=0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addFirst1(String data){
        Node newNode=new Node(data);
        if(head==null) {
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
       Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while (currNode.next!=null){
            currNode=currNode.next;
        }

        currNode.next=newNode;

    }

    void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
       Node currNode=head;
        while (currNode!=null){
            System.out.println(currNode.data);
            currNode=currNode.next;

        }
        System.out.println("Null");

    }
    void deleteFirst(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        size--;
        head=head.next;
    }

    void deleteLast(){
        if(head==null){
            System.out.println("EMpty");
            return;
        }
       Node secondLast=head;
        Node lastNode=head.next;

        size--;
        if(head.next==null){
            head=null;
            return;
        }
        while (lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }

        secondLast.next=null;

    }
    public int getSize(){
        return size;
    }

    public void reverse(){

    }

    public static void main(String[] args) {
        ReverseLinkedList list=new ReverseLinkedList();
        list.addFirst1("a");
        list.addFirst1("B");
        list.addFirst1("C");
        list.addFirst1("D");
        list.addLast("E");
        list.deleteFirst();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
    }


}
