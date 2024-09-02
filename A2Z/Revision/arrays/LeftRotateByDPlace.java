package Revision.arrays;

public class LeftRotateByDPlace {

    static void leftRotate(int arr[],int n,int d){

        d=d%n;
        int temp[]=new int[n];

        for (int i=0;i<n;i++){
            temp[i]=arr[i];
        }
        for(int j=d;j<n;j++){
            arr[j-d]=arr[j];
        }
        int l=0;
        for(int k=n-d;k<n;k++){
            arr[k]=temp[l];
            l++;
        }

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        leftRotate(arr,9,4);

        for (int i=0;i<9;i++){
            System.out.println(arr[i]);
        }
    }
}
