package Revision.recursion;

public class PrintNto1 {
    static void print(int i) {
        if (i < 1) return;
        System.out.println(i);
        print(i - 1);
    }

    public static void main(String[] args) {
        int n = 4; // Starting value
        print(n); // Call print with the initial value
    }
}
