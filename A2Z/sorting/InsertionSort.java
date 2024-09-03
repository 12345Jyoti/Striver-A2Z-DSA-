package sorting;

public class InsertionSort {

    static void insertionSort(int arr[],int n){

        for (int i = 0; i < n; i++) {
            int j=i;

            while(j>0 && arr[j-1]>arr[j]){

//                swap(arr[j],arr[j-1]);
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;

                j--;
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
