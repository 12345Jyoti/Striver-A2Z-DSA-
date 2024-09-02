package interviw;

public class CountNoDigit {

    static int count(int digit){
        int count=0;

        while(digit>0){
            int ld=digit%10;
            count=count+1;
            digit=digit/10;
        }


        return count;
    }

    public static void main(String[] args) {
        int num=1234567;
        System.out.println(count(num));
    }

}
