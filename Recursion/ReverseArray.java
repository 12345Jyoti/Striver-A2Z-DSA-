import java.util.Scanner;

public class ReverseArray {
    static void string(int arr[],int start,int end){
        if(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            string(arr,start+1,end-1);

        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int arr[]=new int[n];
        for(int k=0;k<n;k++){
            arr[k]= sc.nextInt();
        }

        string(arr,0,n-1);

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
