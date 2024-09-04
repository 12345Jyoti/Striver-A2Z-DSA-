package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UsingMap {


    static void occNumber(){
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();

        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }


        //pre compute
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key=arr[i];
            int freq=0;
            if(map.containsKey(key)) {
                freq=map.get(key);
            }

            freq++;
            map.put(key,freq);
        }

        int q= sc.nextInt();

        while (q-->0){
            int num= sc.nextInt();
            System.out.println("Occurance of the "+num+" is: "+map.get(num));
        }


    }

    public static void occChar(){
        Scanner sc=new Scanner(System.in);
        String str="jdsfhjsdghf";
        char[] ch=str.toCharArray();

        //pre comp

        Map<Character,Integer> map=new HashMap<>();

        for (int i = 0; i < ch.length; i++) {
            char key=ch[i];
            int value=0;

            if(map.containsKey(key)){
                value=map.get(key);
            }
            value++;
            map.put(key,value);

        }

        int q = sc.nextInt();
        while (q-->0){
            char c=sc.next().charAt(0);
            System.out.println(map.get(c));
        }

    }
    public static void main(String[] args) {
        occChar();
    }
    }

