package Revision.basics;

public class GCD {
    static void gcd(int a,int b){

        while(a>0&&b>0){
            if(a>b) a=a%b;
            else b=b%a;

            if(a==0) System.out.println("GCD of a and b is: "+b);
            else System.out.println("GCD of a and b is: "+a);
        }
    }

    public static void main(String[] args) {
        int a=20;
        int b=20;
        gcd(a,b);
    }
}
