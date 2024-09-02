package string;

public class ReverseString {

    static void reverse(String str){

        String rev="";

        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
    }

    //Using StringBuilder:...>
    static void StringBuilder(String str){
        StringBuilder st=new StringBuilder(str);
        System.out.println(st.reverse());
    }


    public static void main(String[] args) {
        String str="ABCDEF";
        reverse(str);
        StringBuilder(str);
    }
}
