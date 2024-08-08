import java.util.Scanner;

public class SumOfN_number {
    static void parameterSum(int i,int sum){    //3,0    2,3    1,5   0,6
        if(i<1){     //i==3    2   1 0
            System.out.println("Parameter: "+sum);
            return;
        }
        parameterSum(i-1,sum+i);   //(2,3)    (1,5)    (0,6)

    }
    static int Functional(int n){
        if(n==0){
            return 0;
        }
        return n+Functional(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n= sc.nextInt();
        System.out.println("Functional: "+Functional(n));

        parameterSum(n,0);
    }
}
