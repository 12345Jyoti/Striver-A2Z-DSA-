package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeroToEnd1 {


    static void moveZero(int arr[],int n){

        List<Integer> temp= new ArrayList<>();
        int size=temp.size();


        for(int i=0;i<n;i++){
            if(arr[i]!=0) temp.add(arr[i]);
        }

        for(int i=0;i<size;i++){
            arr[i]= temp.get(i);
        }
        for(int i=size;i<n;i++){
            arr[i]=0;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,1,1,1,6,0,9,0,8,0};
        int n= arr.length;
        moveZero(arr,n);

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
