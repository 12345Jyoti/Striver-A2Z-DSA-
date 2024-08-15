package Revision.recursion;

public class Print1ToN {
    static int count=1;

    static void print(int n){
        if(count>n) return;
        System.out.println(count);
        count++;
        print(n);
    }

    public static void main(String[] args) {
        print(10);
    }
}
