package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MethodOverloadingIntro {
    public static void main(String[] args) {

        int[] intArray = {5, 6, 7, 0, -1, 3, 4};
        Arrays.sort(intArray); // sort method is overloading method used int, double, char etc

        double[] doubleArray = {5.5, 6.5, 7.5, 0, -1.5, 3.5, 4.5};
        Arrays.sort(doubleArray);

        char[] charArray = {'J', 'o', 's', 'h', 'u'};
        Arrays.sort(charArray);

        System.out.println(sumOfNumbers(1, 2));
        System.out.println(sumOfNumbers(1, 2, 3));
        System.out.println(sumOfNumbers(1, 2, 3, 4));

        System.out.println(sumOfNumbers(2.5,3.2,5.3));

    }

    public static int sumOfNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static int sumOfNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

    public static double sumOfNumbers(double num1, double num2) {
        return num1 + num2;
    }

    public static double sumOfNumbers(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public static double sumOfNumbers(double num1, double num2, double num3, double num4) {
        return num1 + num2 + num3 + num4;
    }


}
