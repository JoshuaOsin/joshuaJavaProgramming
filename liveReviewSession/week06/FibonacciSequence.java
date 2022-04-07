package week06;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println("Enter number");
        int termNumber = new Scanner(System.in).nextInt();
        int num1 = 0;
        int num2 = 1;
        int sum = num1 +num2;

        String series = ""+ num1 + " " + num2 + " " ;
        for (int i = 2; i <= termNumber; i++) {
            sum = num1 +num2;
            num1 = num2;
            num2 = sum;
            series += sum +" ";
        }
        System.out.println(series);
    }
}
   /*
        noun: Fibonacci sequence
a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers. The simplest is the series 1, 1, 2, 3, 5, 8, etc.
 Write a program to print
         Fibonacci series of n terms
         where n is declared by user :
         0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......

        This is a example of Fibonacci series of 6 terms

        term number        0    1    2    3    4    5    6
        Actual value    0,     1,     1,     2,     3,     5,     8

                           num1      num2       sum
        iteration 1         0     +    1    =    1
        iteration 2            1   +   1    =    2
        iteration 3            1   +   2    =    3
        iteration 4            2   +   3    =    5
        iteration 5            3    +    5    =    8
        .........
         */