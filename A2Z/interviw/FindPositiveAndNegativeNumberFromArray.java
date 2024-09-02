package interviw;

import java.util.ArrayList;
import java.util.Arrays;

public class FindPositiveAndNegativeNumberFromArray {

    static void findNumber(Integer arr[]){
        ArrayList<Integer> number=new ArrayList<>(Arrays.asList(arr));
        ArrayList<Integer> postive=new ArrayList<>();
        ArrayList<Integer> negative=new ArrayList<>();

        for (Integer num:number){
            if(num>=0){
                    postive.add(num);
            }
            else negative.add(num);
        }
        System.out.println("Postive number is: "+postive);
        System.out.println("Negative number is: "+negative);

    }

    public static void main(String[] args) {
        Integer arr[]={1,2,3,-1,-5,8,0,-3};
        findNumber(arr);

    }
}
