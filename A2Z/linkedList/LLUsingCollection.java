package linkedList;

import java.util.*;

public class LLUsingCollection {




    public static void main(String[] args) {

        LinkedList<String> list=new LinkedList<>();
        list.addFirst("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);
        System.out.println( list.size());
        System.out.print("before reverse:");
        for(String result:list){
            System.out.print(result+" -> ");
        }
        System.out.println("Null");


        List<String> list1=new ArrayList<>(list);

        Collections.reverse(list1);
        list.clear();
        list.addAll(list1);
        System.out.println("Reversed linked list are: ");
        for(String result:list){
            System.out.print(result+" -> ");
        }
        System.out.println("Null");

    }

}
