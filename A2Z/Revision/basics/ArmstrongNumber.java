package Revision.basics;

public class ArmstrongNumber {

    static boolean armStrong(int num){

        int dup=num;    //153
        int armStrNum=0;
        while(num>0){
            int ld=num%10;   //3
            armStrNum=armStrNum+(ld*ld*ld);  //27
            num=num/10;
        }
        if(dup==armStrNum) return true;
        else return false;
    }

    public static void main(String[] args) {
        int num=1;
        boolean result=armStrong(num);

        if(result==true) System.out.println("Yes");
        else System.out.println("No");
    }
}
