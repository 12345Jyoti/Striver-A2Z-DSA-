package Revision.arrays;

import java.awt.image.Kernel;

public class RemoveDupArray {

    static int remove(int[] arr, int n){

        if(n==0) return 0;
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
        int arr[] = {1, 2, 3, 3, 4, 4, 5};
        int n = arr.length;
        int k = remove(arr, n);

        System.out.println("Length of array after removing duplicates: " + k);
        for (int i = 0; i < k; i++) { // Print only up to the new length
            System.out.println(arr[i]);
        }
    }
}
