package Revision.string;

public class ReverseSentance {

    static void reverse(String str) {

        String[] words = str.split(" ");
        String revWords = "";
        for (String word : words) {
            String revWord = "";
            for(int i = word.length()-1; i>=0; i--){
                revWord = revWord + word.charAt(i);
            }
            revWords=revWords+(revWord+" ");
        }
        System.out.println(revWords);

    }

    public static void main(String[] args) {
        String str="I am a Girl";
        reverse(str);

    }
}
