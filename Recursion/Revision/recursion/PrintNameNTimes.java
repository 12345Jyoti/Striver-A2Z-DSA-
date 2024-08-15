package Revision.recursion;

public class PrintNameNTimes {
    static int count=0;
    static void fun(){
         if(count==5) return;
         System.out.println("Ram");
         count++;
         fun();
     }

    public static void main(String[] args) {
        fun();
    }

}
