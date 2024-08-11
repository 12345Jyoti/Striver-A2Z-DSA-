package arrays;

import java.util.Scanner;

public class SortedArray {

    private static boolean sortedArray(int arr[],int n){
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
            }
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean ans=sortedArray(arr,n);

        if(ans==true){
            System.out.println("Array is sorted");
        }
        else System.out.println("Array are not sorted");

    }
}
