package Revision.string;

public class replaceChWithItsOccNum {

    static void replace(String str,char rep){

        int count=1;
        for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
            if (ch == rep) {
                str = str.replaceFirst(String.valueOf(rep), String.valueOf(count));
                count++;
            }
        }
        System.out.println(str);
    }
    
    public static void main(String[] args) {
        String str="fjdhkjghdkjghdg";
        char ch='d';
        replace(str,ch);
    }
}
