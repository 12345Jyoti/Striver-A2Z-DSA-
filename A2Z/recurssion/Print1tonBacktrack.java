package recurssion;

import java.util.Scanner;

public class Print1tonBacktrack {
    static void print(int i,int n){
        if(i<1){
            return;
        }
        print(i-1,n);
        System.out.println(i);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n= sc.nextInt();
        print(n,n);
    }
}
