package sorting;


public class SelectionSort {

    static void selection(int arr[],int n){

        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min]) min=j;
            }
            //swap(arr[min],arr[i])
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }

    }

    public static void main(String[] args) {
        int arr[]={1,2,7,3,5,9,0};

        selection(arr, arr.length);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Selection Sort: ");
        BubbleSort.bubbleSort(arr, arr.length);
        System.out.println("Bubble Sort: ");
        InsertionSort.insertionSort(arr, arr.length);
        System.out.println("Insertion Sort: ");
    }

}
