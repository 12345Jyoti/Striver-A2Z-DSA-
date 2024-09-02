package interviw;

public class Replace {

    public static void main(String[] args) {
        String str="aabcdabsdb";
        System.out.println("Input is : " +str);
        StringBuilder sb=new StringBuilder();

        char[] ch=str.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a') ch[i]='b';
            else if (ch[i]=='b') ch[i]='c';
        }
        for (char ch1:ch){
            sb.append(ch1);
        }
        System.out.println("Output is : "+ sb.toString());
    }
}
