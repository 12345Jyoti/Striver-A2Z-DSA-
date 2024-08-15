package string;

public class repalceChWithItsOccurance {
    static void replace(String str,char ch1){
        char ch[]=str.toCharArray();
        int count=1;
        for(int i=0;i<ch.length;i++){
            if(ch[i]==ch1){
                str=str.replaceFirst(String.valueOf(ch[i]),String.valueOf(count));
                count++;
            }
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        String sr="actctct";
        char ch='t';
        replace(sr,ch);
    }
}
