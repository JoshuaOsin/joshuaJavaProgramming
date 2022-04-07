package day20_Arrays;

import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number "+ (i+1));
            numbers[i] = scan.nextInt();  // user enter input for each array
        }
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
