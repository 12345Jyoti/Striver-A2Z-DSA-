package linkedList111;

class Node1 {
    int data;
    Node1 next;

    Node1(int data, Node1 next) {
        this.data = data;
        this.next = next;
    }

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Array2LL {



    private static Node1 array2ll(int arr[]) {
        if (arr.length == 0) {
            return null;  // Handle empty array case
        }

        Node1 head = new Node1(arr[0]);  // Start with the first element
        Node1 mover = head;

        for (int i = 1; i < arr.length; i++) {  // Start loop from the second element
            Node1 temp = new Node1(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    private static int lengthOfLL(Node1 head) {
        int count = 0;
        Node1 temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {11, 2, 3, 4, 5, 6};

        Node1 head = array2ll(arr);

        System.out.println("Length of Linked List: " + lengthOfLL(head));

        // Traverse and print the linked list
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
