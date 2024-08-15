package string;

import java.util.HashMap;
import java.util.Map;

public class ReoccurrenceEachCharacter {

    static void occurrence(String str){

        char ch[]=str.toCharArray();
        StringBuilder sb=new StringBuilder();

        Map<Character,Integer> map=new HashMap<>();
        for(char ch1:ch){
            if(map.containsKey(ch1)){
                int count= map.get(ch1);
                map.put((ch1),count+1);
            }
            else{
                map.put((ch1),1);
            }
        }
        System.out.print(map);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey()).append(entry.getValue());

        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str="djshdjssdg";
        occurrence(str);
    }
}
