package Revision.string;

public class SortAlphabets {

    static void sort(String str){

        char[] ch=str.toCharArray();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j< ch.length;j++){
                if(ch[i]>ch[j]){
                    int temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=(char) temp;
                }
            }
           sb.append(ch[i]);

        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str="fjdhkjghdkjghdg";
        sort(str);
    }
}
