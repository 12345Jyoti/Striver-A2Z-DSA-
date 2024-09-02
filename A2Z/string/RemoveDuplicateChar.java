package string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {

    static String removeDuplicate(String str){

        char[] ch=str.toCharArray();
        StringBuilder sb=new StringBuilder();

        Set<Character>  set=new LinkedHashSet<>();
        for (int i = 0; i < ch.length; i++) {
            set.add(ch[i]);
        }
        for(char ch1:set){
            sb.append(ch1);
            }
        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "AABBCCDD";
        StringBuilder sb = new StringBuilder();

        System.out.println(removeDuplicate(str));


    }

}
