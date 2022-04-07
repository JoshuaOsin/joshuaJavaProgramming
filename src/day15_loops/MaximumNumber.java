package day15_loops;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -2147483648;
        for (int i =1 ; i<=5; i++) {
            System.out.print("Enter " + i + " value :");
            int givenValue = scan.nextInt();

            if ( givenValue > max) {
                max = givenValue;
            }
        }
        System.out.println("max = " + max);

        scan.close();
    }
}
