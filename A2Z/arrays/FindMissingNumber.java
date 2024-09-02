package arrays;

public class FindMissingNumber {
    static int missingNumber(int arr[],int n){

        int sum1=0;

        int sum=(n*(n+1))/2;

        for(int i=0;i<n-1;i++){
            sum1+=arr[i];
        }
        return sum-sum1;

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7};
        int n = arr.length + 1;;

        System.out.println(missingNumber(arr,n));
    }
}
