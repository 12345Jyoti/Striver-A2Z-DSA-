package Revision.recursion;

public class SumOfN {
    static int Functional(int n){
        if(n==0){
            return 0;
        }
        return n+Functional(n-1);
    }

    public static void main(String[] args) {
        System.out.println(Functional(5));
    }
}
