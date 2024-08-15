package string;

public class ReverseWord {
    static void reverseWord(String str){

        String[] words =str.split(" ");
        String rev="";
        for(String word : words){
        String revWord ="";
        for(int i = word.length()-1; i>=0; i--){
            revWord = revWord + word.charAt(i);
        }
        rev=rev+(revWord+" ");
    }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        String str="I AM Jyoti";
        reverseWord(str);
    }
}
