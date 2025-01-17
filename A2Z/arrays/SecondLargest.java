package arrays;

import java.util.Scanner;

public class SecondLargest {

    private static int sLargest(int arr[],int size){

        int largest=arr[0];
        int secondLargest=-1;

        for(int i=0;i<size;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if (arr[i]<largest&&arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sLargest(arr,size));
    }
}
