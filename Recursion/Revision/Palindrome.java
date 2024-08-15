package Revision;

public class Palindrome {

    private static boolean palindrome(int num){
        int dup=num;
        int rev=0;
        while(num>0){
            int ld=num%10;
             rev=rev*10+ld;
             num=num/10;
        }
        if(dup==rev){
            return true;

        }
        else return false;
    }

    public static void main(String[] args) {
        int num=12321;
        int num1=12345;


        boolean result=palindrome(num1);
        if(result==true){
            System.out.println("Palindrome");
        }
        else System.out.println("Not a Palindrome");
    }
}
