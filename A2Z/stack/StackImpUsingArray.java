package stack;

import java.util.*;


class Stack{
    int size=1000;
    int arr[]=new int[size];
    int top=-1;

    void push(int x){
        top++;
        arr[top]=x;
    }
    int pop(){
        int x=arr[top];
        top--;
        return x;
    }
    int top(){
        return arr[top];
    }
    int size(){
        return top+1;
    }
}

public class StackImpUsingArray {




    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(6);
        s.push(3);
        s.push(5);
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.top());



    }
}
