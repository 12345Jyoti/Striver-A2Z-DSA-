package Revision.arrays;

public class RightRotate {

    static void rightRotate(int arr[],int n,int d){

        d=d%n;

        int temp[]=new int[n];

        for(int i=0;i<d;i++){
            temp[i]=arr[i-(n-d)];
        }
        for(int i=n-d-1;i>=0;i--){
            arr[i+d]=arr[i];

        }
        for(int i=0;i<d;i++){
            arr[i]=temp[i];
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int d=3;int n=arr.length;
        rightRotate(arr,n,d);

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
