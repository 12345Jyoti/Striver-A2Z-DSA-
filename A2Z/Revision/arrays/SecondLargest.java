package Revision.arrays;

public class SecondLargest {
    static void secondLargest(int arr[],int n){

        int largest=arr[0];
        int secondLargestNumber= Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondLargestNumber=largest;
                largest=arr[i];
            }
            else if (arr[i]<largest && arr[i]>secondLargestNumber){
                secondLargestNumber=arr[i];
            }
        }
        System.out.println(secondLargestNumber);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        secondLargest(arr, arr.length);
    }
}
