package Revision.arrays;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroToEnd {

    static void moveZero(int arr[],int n){
        List<Integer> temp=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        for(int i=0;i<temp.size();i++){
            arr[i]=temp.get(i);
        }
        for(int i= temp.size();i<n;i++){
            arr[i]=0;
        }}


        public static void main(String[] args) {
            int arr[]={1,2,0,3,0,0,4,5,6,7};
            int n=arr.length;
            moveZero(arr,n);

            for(int i=0;i<n;i++){
                System.out.println(arr[i]);
            }
        }
}
