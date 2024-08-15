package Revision;

public class AllDivisors {

    static void allDivisor(int num){

        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int num=12;
        allDivisor(num);
    }
}
