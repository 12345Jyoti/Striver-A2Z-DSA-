package Revision;

public class CheckPrimeNum {

    static void primeNumber(int num){

        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2) System.out.println("Prime Number");
        else System.out.println("Not Prime Number");
    }

    public static void main(String[] args) {
        int number=11;
        primeNumber(number);
    }
}
