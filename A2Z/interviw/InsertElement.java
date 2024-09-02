package interviw;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertElement {

    public static void main(String[] args) {
        String [] element={"abc","bca","cdf","dfg"};
        String newElement="aaaa";

        ArrayList<String> list=new ArrayList<>(Arrays.asList(element));

        for(int i=0;i< list.size();i++){
            if(list.get(i).equals("bca")){
                list.add(i+1,newElement);
            }
        }
        System.out.println(list);
    }
}
