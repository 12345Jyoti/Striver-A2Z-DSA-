package Revision.arrays;

public class LeftRotateBy1Place {

    static void leftRotate(int arr[],int n){
        int temp=arr[0];

        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        leftRotate(arr, arr.length);

        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
