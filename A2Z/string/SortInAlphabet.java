package string;

public class SortInAlphabet {

    static String sort(String str){

        char[] ch =str.toCharArray();
        StringBuilder sb= new StringBuilder();

        for(int i=0;i< ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]>ch[j]){
                    int temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]= (char) temp;
                }
            }
        }
        for (int i=0;i< ch.length;i++){
            sb.append(ch[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str="jsdhksjfh";

        System.out.println(sort(str));
    }
}
