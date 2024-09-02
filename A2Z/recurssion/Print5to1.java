package recurssion;

import java.util.Scanner;

public class Print5to1 {

    static void print(int i,int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        print(i-1,n);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n= sc.nextInt();

        print(n,n);
    }
}
