import java.util.Scanner;

public class PalindromeString {


    static boolean pString(String s, int i){

        if(i>=s.length()/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return  false;
        return pString(s,i+1);

    }

    static boolean string(String s){
        int left=0;int right=s.length()-1;

        while(left<right){
            char l=s.charAt(left),r=s.charAt(right);
            if(!Character.isLetterOrDigit(l)){
                left++;
            }
            else if(!Character.isLetterOrDigit(r)){
                right--;
            } else if (Character.isLowerCase(l)!=Character.isLowerCase(r)) {
                return false;

            }
            else {
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="MADAM";
//        boolean ans=string(str);
//        if(ans==true){
//            System.out.println("Palindrome");
//        }
//        else {
//            System.out.println("Not");
//        }
        System.out.println(pString(str,0));

    }

    }

