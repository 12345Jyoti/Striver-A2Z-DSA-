package recurssion;

import java.util.Scanner;

public class Print1to5 {
   static void print(int i,int n){

       if(i>n){
           return;
       }
       System.out.println(i);
       print(i+1,n);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n= sc.nextInt();
//        System.out.println("Enter the value of i: ");
//        int i=sc.nextInt();

        print(1,n);
    }
}
