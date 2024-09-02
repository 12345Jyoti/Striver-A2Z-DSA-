package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindUnion {

    static List<Integer> union(int A[],int B[],int n,int m){

       List<Integer> union=new ArrayList<>();
        Set<Integer> st=new HashSet<>();

        for(int i=0;i<n;i++){
            st.add(A[i]);
        }
        for (int i=0;i<n;i++){
            st.add(B[i]);
        }
        for(int it:st){
            union.add(it);

        }
        return union;

    }

    public static void main(String[] args) {
        int A[]={1,2,4,6,7,9};
        int B[]={2,2,3,5,5,6,88};
        int n=A.length;
        int m= B.length;

        System.out.println(union(A,B,n,m));
    }

}
