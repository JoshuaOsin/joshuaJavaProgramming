package week03;

import java.util.Scanner;

public class ControlFlowIfStatements {

    public static void main(String[] args) {

        // Task: find if a given integer even or odd number
        // Hint use % operators , and

        //int number = 100;
// Create scanner object and create variables
        Scanner input = new Scanner(System.in);
        int number;

        // request user input
        System.out.print("Please give the number  :");

        // read user input and assign the variable
        number = input.nextInt();
        if (number%2 == 0) {
            System.out.println(number+ " is Even number");
        } else {
            System.out.println(number+ " is Odd number");
        }





    }



}
