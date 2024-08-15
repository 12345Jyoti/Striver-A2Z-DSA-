package Revision.arrays;

import java.util.Arrays;

public class LargestNumber {

    static  void largestUsingSorting(int arr[]){
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }

    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,6};
        largestUsingSorting(arr);
        largestUsingWithoutSorting(arr,arr.length);
    }
    static  void largestUsingWithoutSorting(int arr[],int n){
        int largest=arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
