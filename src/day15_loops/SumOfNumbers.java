package day15_loops;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <101; i++) {
            sum += i; // sum = sum + i;
        }
        System.out.println("sum = " + sum);

        System.out.println("----------------");

        Scanner scan = new Scanner(System.in);
        int total =0;
        for (int i =1 ; i<=5; i++) {
            System.out.print("Enter " + i + " value :");
            total += scan.nextInt();
        }
        System.out.println(total);

        scan.close();
    }
}
