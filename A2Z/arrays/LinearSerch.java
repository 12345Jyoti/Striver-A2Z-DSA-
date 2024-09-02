package arrays;

public class LinearSerch {

    static int search(int arr[],int n,int k){

        for(int i=0;i<n;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n= arr.length;
        int k=9;
        System.out.println(search(arr,n,k));
    }
}
