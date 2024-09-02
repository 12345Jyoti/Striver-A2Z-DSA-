package interviw;

public class CheckSortedOrNot {

    static boolean isSorted(int arr[],int n){
        ////1 2 3 4 5 6
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        boolean ans=isSorted(arr,n);

        if(ans==false){
            System.out.println("Not Sorted");
        }
        else System.out.println("Sorted");
    }
}
