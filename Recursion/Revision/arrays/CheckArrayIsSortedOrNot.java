package Revision.arrays;

public class CheckArrayIsSortedOrNot {
    static boolean sorted(int arr[],int n){
        for(int i=0;i<n;i++){
            if(arr[i]<=arr[i+1]){

            }
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[]={1,6,2,3,5,6,7};
       boolean k= sorted(arr,arr.length-1);
       if(k==true) System.out.println("Sorted");
       else System.out.println("Not Sorted");

    }
}
