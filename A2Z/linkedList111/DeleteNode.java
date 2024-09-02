package linkedList111;

public class DeleteNode {

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

    static Node deleteHead(Node head){

        if(head==null) return head;
        Node temp=head;
        head=head.next;

        return head;
    }
    static Node deleteTail(Node head){
        if((head==null)||(head.next==null)) return null;
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;

    }

    static Node deleteKth(Node head,int k){

        if(head==null) return null;

        if(k==1){
            head=head.next;
            return head;
        }

        int cnt=0;
        Node temp=head;
        Node prev=null;

        while(temp!=null){
            cnt++;
            if(cnt==k){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }

    static Node removeElement(Node head,int element){

        if(head==null) return null;

        Node temp=head;
        Node prev=null;

        while(temp!=null){
            if(temp.data==element){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;

        }
        return head;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,11,5,6};
        Node head=array2LL(arr);
//        printLL(head);
//         head= deleteHead(head);
//        head=deleteTail(head);
//        head=deleteKth(head,4);
        head=removeElement(head,4);
        printLL(head);

    }
}
