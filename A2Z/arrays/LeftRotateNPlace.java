package arrays;

public class LeftRotateNPlace {

    ///Brute Case
   static void leftRotate(int arr[],int n,int d){

       d=d%n;    ///1234567
       int temp[]=new int[n];
       for(int i=0;i<n;i++){
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
   
   

   static void reverse(int arr[],int start,int end){

       while(start<=end){
           int temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
       }
   }

    public static void main(String[] args) {
            int arr[]={1,2,3,4,5,6,7};
        int d=3;int n=arr.length;
        leftRotate(arr,n,d);

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
    }
   }
}
