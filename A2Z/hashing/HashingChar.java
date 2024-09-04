package hashing;

import java.util.Scanner;

public class HashingChar {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String str= sc.next();
        char[] ch=str.toCharArray();

        //pre compute

        int hash[]=new int[256];
        for (int i = 0; i < str.length(); i++) {
            hash[ch[i]]++;

        }

        int q= sc.nextInt();
        while (q-->0){
            char c=sc.next().charAt(0);
            System.out.println(hash[c]);

        }
    }
}
