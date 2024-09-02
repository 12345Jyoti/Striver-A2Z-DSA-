package linkedList111;

public class InsertLL {
    static Node array2LL(int arr[]){
        Node head=new Node(arr[0]);
        Node mover=head;

        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;

    }

    static void printLL(Node head){

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
    static Node inserHead(Node head,int val){
        Node temp=new Node(val,head);
        return temp;
    }
    static Node insertTail(Node head,int val){
       if(head==null) return new Node(val);

       Node temp=head;
       while(temp.next!=null){
           temp=temp.next;
       }
       Node newNode=new Node(val);
       temp.next=newNode;
       return head;
    }

    static Node insertKthPosition(Node head,int element,int k){

        if(head==null){
            if(k==1){
                return new Node(element);
            }
        }
        if(k==1){
            Node newNode=new Node(element);
            return newNode;
        }

        int cnt=0;
        Node temp=head;

        while (temp!=null){
            cnt++;
            if(cnt==(k-1)){
                Node newNode=new Node(element);
                newNode.next=temp.next;
                temp.next=newNode;
                break;
            }
            temp= temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,11,5,6};
        Node head=array2LL(arr);
//        head=inserHead(head,10);
//        head=insertTail(head,100);
        head=insertKthPosition(head,3,3);
        printLL(head);
    }
}
