package Revision;

public class CountDIgit {

    private static void countDigit(int n){
        int temp=0;
        while(n>0){
            int lastDigit=n%10;
            temp++;
            n=n/10;
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
        int num=12345;
        countDigit(num);
    }
}
