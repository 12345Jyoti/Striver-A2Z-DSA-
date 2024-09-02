package recurssion;

import java.util.Scanner;

public class Fibonacci {

    static int fibonacci(int n){
        if(n==0){
            return 1;
        }
        return n*fibonacci(n-1);

    }
    static void fib(int n,int fib){
        if(n<1){
            System.out.println(fib);
            return;
        }
        fib(n-1,fib*n);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println(fibonacci(n));
        fib(n,1);

    }

}
