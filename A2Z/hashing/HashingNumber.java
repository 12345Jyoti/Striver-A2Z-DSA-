package hashing;

import java.util.Scanner;

public class HashingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Write the element of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        int hash[]=new int[15];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]+=1;
        }

        int q= sc.nextInt();

        while (q-->0){
            int num= sc.nextInt();
            System.out.println("Occurance of the "+num+" is: "+hash[num]);
        }

           }

}
