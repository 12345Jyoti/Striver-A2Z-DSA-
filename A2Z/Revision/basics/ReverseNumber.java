package Revision.basics;

public class ReverseNumber {

    private static void reverse(int num){
        int rev=0;

        while (num>0){

            int ld=num%10;
            rev=rev*10+ld;
            num=num/10;
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        int num=123456;
        reverse(num);
    }
}
