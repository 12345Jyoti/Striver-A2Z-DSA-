package arrays;

import java.util.Scanner;

public class SecondSmallest {
    private static int secodSmallest(int arr[],int size){

        int smallest=arr[0];
        int sSmall=Integer.MAX_VALUE;

        for(int i=0;i<size;i++){
            if(arr[i]<smallest){
                sSmall=smallest;
                smallest=arr[i];
            }
            else if(arr[i]!=smallest&&arr[i]<sSmall){
                sSmall=arr[i];
            }
        }
        return sSmall;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();

        }
        System.out.println(secodSmallest(arr,size));
    }
}
