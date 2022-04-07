package week02;

public class ArithmeticOperators {
/*
Division
* in Math 10/3 in Java  int/int result int
                        double/int result double
                        int/double result double
 */
    public static void main(String[] args) {
        System.out.println("10 / 3\t:"+(10/3));
        System.out.println("10 / 3.0\t:"+(10/3.0));
        System.out.println("10 / 3\t:"+10+3);

        //which operator comes first
        // (,) comes first before division, multiplication is before concatenation


        // IMPORTANT : JAVA runs from top to bottom and left to right

        int num1 = 10;
        double num2 = 3.0;

        int results = num1/(int)num2; // explicit casting

        System.out.println("results = " + results);

        int a = 10;
        int b = 20;
        System.out.println("a = "+a+" *  b = "+b+" result "+ (a*b));
        System.out.println(a*b+10);

    }
}
