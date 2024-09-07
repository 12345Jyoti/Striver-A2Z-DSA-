package javaEightFeatures.lambdaFun;

public class JavaEigthFeaturs {

    public static void main(String[] args) {

        SumInter sum=(int a, int b) ->{
            return a+b;
        } ;
        SumInter sum1 =( a,  b) -> a+b;


        LengthInter strLength=(str-> str.length());

        System.out.println(strLength.getLength("ajdshajdhjhd"));

        System.out.println(sum1.sum(2,1));

    }
}
