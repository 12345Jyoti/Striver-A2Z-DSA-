package interviw;

public class LRByKPlace {

    static void leftRotate(int arr[],int n,int k){

        int temp[]=new int[n];

        for(int i=0;i<n;i++){
            temp[i]=arr[i];
        }
        for (int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }
        int l=0;
        for(int i=n-k;i<n;i++){
            arr[i]=temp[l];
            l++;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);

        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
leftRotate(arr, arr.length, 3);
    }
}
