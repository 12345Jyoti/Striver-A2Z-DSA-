package Revision.string;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupChar {

    static void remove(String str){

        char[] ch=str.toCharArray();
        Set<Character> set=new HashSet<>();
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<ch.length;i++){
            set.add(ch[i]);
        }
        for(Character ch1:set){
            sb.append(ch1);
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String str="fjdhkjghdkjghdg";
        remove(str);
    }
}
