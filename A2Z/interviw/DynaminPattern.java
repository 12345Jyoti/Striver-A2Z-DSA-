package interviw;

public class DynaminPattern {

    public static void nStarTriangle(int n) {
//        for(int i=1;i<=2*n-1;i++){
//            int stars=i;
//            if(i>n) stars=2*n-i;
//            for(int j=1;j<=stars;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }



//    static void pattern(int num){
//        for(int i=1;i<=num;i++){
//            for(int j=num-1;j>=i;j--){
//                System.out.print(" ");
//            }
//            for (int k = 1; k <=i ; k++) {
//                System.out.print("*");
//
//            }
//            for (int l =  2;l <=i ; l++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=2*num-1;i++){
//            if(i<=num){
//                for(int j=num-1;j>=i;j--){
//                    System.out.print(" ");
//                }
//                for(int j=1;j<=i;j++){
//                    System.out.print("*");
//                }}
//                else{
//                    for(int j=num+1;j>=i;j--){
//                        System.out.print("*");
//                    }
//
//
//            }
//            System.out.println();
//        }
//
//
//
//        for(int i=1;i<=2*num-1;i++){
//            if(i<=num){
//                for(int j=1;j<=i;j++){
//                    System.out.print("*");
//                }
//            }
//            else{
//                for(int k=1;k<=2*num-i;k++){  // 10-6-1
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//
//
//        }}
//    static void pattern1(int n){
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//            for(int l=0;l<2*i+1;l++){
//                System.out.print("*");
//            }
//            for(int k=0;k<n-i-1;k++){
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
    int i,j;
    for(i = 0; i < (n / 2) + 2; i++)
    {
        for(j = 0; j < n - i; j++)
        {
            System.out.print(" ");
        }
        for(j = 0; j < 2 * i + 1; j++)
        {
            System.out.print("@");
        }
        System.out.println();
    }

    for(i = 0; i < n; i++)
    {
        for(j = 0; j < (n / 2) + 1; j++)
        {
            if (j >= n / 2 - i && j >= i - n / 2)
            {
                System.out.print("*");
            }
            else
                System.out.print(" ");
        }
        for(j = 0; j < n; j++)
        {
            if (i == n / 2)
                System.out.print("@");
            else
                System.out.print(" ");
        }
        for(j = 0; j < (n / 2) + 1; j++)
        {
            if (j >= n / 2 - i && j >= i - n / 2)
                System.out.print("*");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        int num=5;
//        pattern1(num);
        nStarTriangle(num);
    }
}


















//
//public class DynaminPattern {
//    public static void main(String[] args) {
//
//        int n=5;
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=5-i+1;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//        System.out.println();
//        System.out.println();
//
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=5-i+1;j++){
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print("*");
//            }
//
//            for(int l=2;l<=i;l++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        // System.out.println();
//        // System.out.println();
//        // System.out.println();
//
//
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(" ");
//            }for(int k=1;k<=5-i+1;k++){
//                System.out.print("*");
//            }
//            for(int l=4;l>=i;l--){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//        System.out.println();
//        System.out.println();
//        System.out.println();
//
//        for(int i=0;i<5;i++){
//            for (int l=0;l<5-i+1;l++) {
//                System.out.print(" ");
//
//            }
//            for (int k=0;k<i*2+1;k++) {
//                System.out.print("*");
//
//            }
//            for (int l=0;l<5-i+1;l++) {
//                System.out.print(" ");
//
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//        System.out.println();
//        System.out.println();
//
//        for(int i=1;i<=2*n-1;i++){
//            if(i<=n){
//                for(int j=1;j<=i;j++){
//                    System.out.print("*");
//                }
//            }
//            else{
//                for(int k=1;k<=2*n-i;k++){  // 10-6-1
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//        System.out.println();
//        System.out.println();
//        System.out.println();
//
//        int Start=1;
//
//        for(int i=0;i<n;i++){
//
//            if(i%2==0) Start=1;
//            else Start=0;
//            for(int j=0;j<=i;j++){
//                System.out.print(Start);
//                Start=1-Start;
//
//
//            }
//            System.out.println();
//        }
//        System.out.println();
//        System.out.println();
//        System.out.println();
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//
//            }
//            for(int k =1;k<=2*n-2*i;k++){
//                System.out.print(" ");
//            }
//            for(int j=i;j>=1;j--){
//                System.out.print(j);
//
//            }
//            System.out.println();
//        }
//        System.out.println();
//        System.out.println();
//        System.out.println();
//
//
//        int num=1;
//        for(int j=1; j<=5;j++){
//            for(int i=1;i<=j;i++){
//                System.out.print(num+" ");
//                num++;
//            }
//            System.out.println();
//        }
//        System.out.println();
//        System.out.println();
//
//
//        for(int i=0;i<n;i++){
//            for(char j='A';j<='A'+i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//
//
//        System.out.println();
//        System.out.println();
//
//        // char ch='A';
//        for(int i=0;i<n;i++){
//            char ch=(char)((int)('A'+i));
//            for(char j=0;j<=i;j++){
//                System.out.print(ch);
//            }
//            System.out.println();
//        }
//
//
//        System.out.println();
//        System.out.println();
//
//        for(int i=1;i<=n;i++){
//            for(char j='A';j<'A'+n-i+1;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//        System.out.println();
//
//        for(int i=0;i<n;i++){
//            for(int j=1;j<=n-i+1;j++){
//                System.out.print(" ");
//            }
//            for(char j='A';j<'A'+i;j++){
//                System.out.print(j);
//            }
//            for(char k=(char)(int)('A'+i);k>'A';k--){
//                System.out.print(k);
//            }
//            System.out.println();
//        }
//
//
//        System.out.println();
//        System.out.println();
//
//        for(int i=0;i<n;i++){
//
//            for(char j=(char)(int)(('A'+n-1)-i);j<=(char)(int)('A'+n-1);j++){
//                System.out.print(j);
//
//
//            }
//            System.out.println();
//        }
//
//
//
//    }}
