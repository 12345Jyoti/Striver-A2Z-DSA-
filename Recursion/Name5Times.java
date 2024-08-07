import java.util.Scanner;

public class Name5Times {
    static int count=1;
    static void printName(int n){
        if(count>5){
            return;
        }
        System.out.println("Jyoti");
        count++;
        printName(n);

    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n= sc.nextInt();
        printName(n);



    }
}
