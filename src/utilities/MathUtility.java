package utilities;

public class MathUtility {

    // method that can return the sum of two integer numbers, return integer
    public static int sum(int num1, int num2) {
        return num1+num2;
    }
    
    //method that can return the sum of two decimal numbers, return decimal
    public static double sum(double num1, double num2) {
        return num1+num2;
    }
    // method that can return the subtraction of two integers, return integer
    public static int subtraction(int num1, int num2) {
        return num1-num2;
    }
    
    //method that can return the subtraction of two decimals,return decimal
    public static double subtraction(double num1, double num2) {
        return num1-num2;
    }

    // method that can return the multiplication of two integers, return integer
    public static int multiplication(int num1, int num2) {
        return num1*num2;
    }

    //method that can return the multiplication of two decimals,return decimal
    public static double multiplication(double num1, double num2) {
        return num1*num2;
    }

    // method that can return the division of two integers, return integer
    public static int division(int num1, int num2) {
        return num1/num2;
    }

    //method that can return the division of two decimals,return decimal
    public static double division(double num1, double num2) {
        return num1/num2;
    }

    //method that can check if an integer is even number, return boolean
    public static boolean isEven(int num) {
        return num%2==0;
    }

    //method that can check if an integer is odd number, return boolean
    public static boolean isOdd(int num) {
        return num%2!=0;
    }

    //	method that can return the maximum number between two integers, return integer
    public static int max(int num1, int num2) {
        int max = (num1>num2)?num1:num2;
        return max;
    }
    //	method that can return the maximum number between two double, return double
    public static double max(double num1, double num2) {
        double max = (num1>num2)?num1:num2;
        return max;
    }

    //	method that can return the minimum number between two integers, return integer
    public static int min(int num1, int num2) {
        int min = (num1<num2)?num1:num2;
        return min;
    }
    //	method that can return the minimum number between two double, return double
    public static double min(double num1, double num2) {
        double min = (num1<num2)?num1:num2;
        return min;
    }

    // 	method that can return the square of an integer, return integer
    public static int square(int num) {
        return num*num;
    }

    // 	method that can return the square of an double, return double
    public static double square(double num) {
        return num*num;
    }

    // 	method that can return the cube of an integer
    public static int cube(int width, int length, int heigth) {
        return width*length*heigth;
    }

    // 	method that can return the cube of an double
    public static double cube(double width, double length, double heigth) {
        return width*length*heigth;
    }

}
