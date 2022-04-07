package week06;

import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean check = true; // initilization for loop

        for (; check; ) { // condition for loop
            System.out.println("Give upper Bound :");
            int upperbound = scan.nextInt();

            int sum = 0;
            if (upperbound >= 1) {
                for (int i = 1; i <= upperbound; i++) {
                    sum += i;
                }
                System.out.println(sum);
                check = false; // iteration for loop
            } else {
                System.out.println("please Enter a valid number again");
            }
        }
    }
}
/*
 *
 * Question-8:

 Write a program to calculate the sum of the numbers from 1 till upper bound.
 If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
 If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
 If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.

 */