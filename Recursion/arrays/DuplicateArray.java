package arrays;

import java.util.Scanner;

public class DuplicateArray {

    public static int removeDuplicate(int arr[],int n){

        int j=0;
        for(int i=1;i<n;i++){
            if(arr[j]!=arr[i]){
                arr[j+1]=arr[i];
                j++;
            }
        }
        return j+1;
    }
    public static void main(String[] args) {

        int arr[]={1,2,2,3,4,5,6};

        int n=arr.length;

        int k=removeDuplicate(arr,n);

        System.out.println("size "+k);
        for(int i=0;i<n-1;i++){
            System.out.println("Arrys are "+arr[i]);
        }


    }
}
