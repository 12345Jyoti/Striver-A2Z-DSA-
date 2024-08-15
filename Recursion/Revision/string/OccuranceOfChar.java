package Revision.string;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfChar {

    static void occurence(String str){

        char[] ch=str.toCharArray();
        StringBuilder sb=new StringBuilder();

        Map<Character,Integer> map=new HashMap<>();

        for(int i=0;i<ch.length;i++){
            if(!map.containsKey(ch[i])){
                map.put(ch[i],1);
            }
            else {
                int count=map.get(ch[i]);
                map.put(ch[i],count+1);

            }

        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            sb.append(entry.getKey()).append(entry.getValue());
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str="abacds";
        occurence(str);
    }

}
