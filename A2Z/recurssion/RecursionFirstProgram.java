package recurssion;

import java.util.Scanner;

public class RecursionFirstProgram {
    static int count = 0;

    // Method with static count variable
    static void f(int n) {
        if (count == 3) {
            return; // Stop recursion after printing 3 times
        }
        System.out.println(n);
        count++;
        f(n); // Recursive call with the same parameter
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        
        // Reset count before starting recursion
//        count = 0;
        f(n);

        System.out.println("Hello, World!");
    }
}
