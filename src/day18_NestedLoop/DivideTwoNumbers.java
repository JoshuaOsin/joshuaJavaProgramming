package day18_NestedLoop;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number");
        int firstNumber = scan.nextInt();
        System.out.println("enter second number");
        int secondNumber = scan.nextInt();
        int count = 0;
        while (firstNumber >= secondNumber) {
            firstNumber -= secondNumber;
            count++;
        }
        System.out.println("Result : " + count+ " and remainder of "+ firstNumber);

    }
}
/*
:
        1.  Write a program
        that can divide two positive numbers without using / (division) and * (multiplication) and % operators
 */