package arrays;

import java.util.Arrays;

public class SingleNumber {
    static int singleNumber(int arr[],int n){

        for(int i=0;i<n;i++) {
            int num = arr[i];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == num)
                    count++;
            }
            if (count == 1) return num;
        }
           return -1;
        }

    public static void main(String[] args) {
        int arr[]={4,1,2,1,2};  //11224
        int n=arr.length;
        System.out.println(singleNumber(arr,n));;
    }
}
