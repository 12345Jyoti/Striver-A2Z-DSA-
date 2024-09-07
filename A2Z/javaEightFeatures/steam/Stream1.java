package javaEightFeatures.steam;

import java.net.Inet4Address;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> list=List.of(2,3,4,5,6,22,44);

//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i)%2==0){
//                System.out.println((list.get(i)));
//
//            }
            List<Integer> stream=list.stream().filter(j->j>10).collect(Collectors.toList());
//           List<Integer> newList=stream.filter(j->j%2==0).collect(Collectors.toList());
            System.out.println(stream);
        }
    }



