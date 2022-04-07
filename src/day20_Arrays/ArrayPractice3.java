package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int lenght = scan.nextInt();

        if (lenght <= 0) {
            System.err.println("Invalid Entry");
            System.exit(0);
        }

        int [] numbers = new int[lenght];

        for (int i = 0; i < lenght; i++) {
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
    }
}
