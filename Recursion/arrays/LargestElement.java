package arrays;

import java.util.Scanner;

public class LargestElement {

    private static int largest(int arr[],int size){

        int largestElement=arr[0];

        for(int i=0;i<size;i++){
            if(arr[i]>largestElement){
                largestElement=arr[i];
            }
        }
        return largestElement;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(largest(arr,size));
    }
}
