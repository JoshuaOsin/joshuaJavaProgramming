package day15_loops;

import java.util.Scanner;

public class MinimumOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 2147483647;
        for (int i =1 ; i<=5; i++) {
            System.out.print("Enter " + i + " value :");
            int givenValue = scan.nextInt();
            if ( givenValue < min) {
                min = givenValue;
            }
        }
        System.out.println("min = " + min);
        scan.close();
        
    }
}
