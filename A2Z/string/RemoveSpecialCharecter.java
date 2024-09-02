package string;

public class RemoveSpecialCharecter {
    static void removeSpecialCh(String str){

        String str1=str.replaceAll("[^a-zA-z0-9]","");
        System.out.println(str1);
    }
    static void removeWhiteSpace(String str){
        String str1=str.replaceAll("\\s","");
        System.out.println(str1);
    }


    public static void main(String[] args) {
        String str="%$%GFGF&%GFG&&GFG";
        String str1="sd sdfsd sdfsdf sdfsdf";
        removeSpecialCh(str);
        removeWhiteSpace(str1);
    }
}
