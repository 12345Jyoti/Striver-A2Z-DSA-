public class Fibonnaci {

    static int fibonacci(int n) {
        if (n <= 1) return n;
        int last = fibonacci(n - 1);
        int sLast = fibonacci(n - 2);
        return last + sLast;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacci(n));

//        int n1=0,n2=1;
//
//        System.out.print(n1+" "+n2+" ");
//
//        int num=10;
//
//        for(int i=2;i<num;i++){
//            int n3=n1+n2;
//            System.out.print(n3+" ");
//            n1=n2;
//            n2=n3;
//        }



    }}
