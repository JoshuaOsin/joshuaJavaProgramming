package day25_CustomMethods_Overloading;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum2 = sumOf2Numbers(10,20);
        int sum3 = sumOf3Numbers(10,20,30);
        int sum4 = sumOf4Numbers(10,20,30,40);
        System.out.println(sum2 + " three "+ sum3+ "four" +sum4);
    }
    public static int sumOf2Numbers( int num1, int num2) {
        return num1+num2;
    }

    public static int sumOf3Numbers( int num1, int num2,int num3) {
        return num1+num2+num3;
    }

    public static int sumOf4Numbers( int num1, int num2,int num3 ,int num4) {
        return num1+num2+num3+num4;
    }

}
