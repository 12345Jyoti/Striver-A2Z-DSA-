package arrays;

import com.sun.source.tree.BreakTree;

public class MaxOneConsecutive {

    static int maxOne(int arr[],int n){
        int count=0;
        int max=0;

        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                max=Math.max(max,count);
            }
            else count=0;
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,1,1,1,1,1,3,1,3,1};
        int n= arr.length;
        System.out.println(maxOne(arr,n));
    }


}
