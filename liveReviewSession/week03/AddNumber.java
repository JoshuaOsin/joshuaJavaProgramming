package week03;

import java.util.Scanner;

public class AddNumber {

    public static void main(String[] args) {
        // Create scanner object and create variables
        Scanner input = new Scanner(System.in);
        double number1, number2, number3, number4, total;

        // request user input
        System.out.print("Please give the number 1 :");

        // read user input and assign the variable
        number1 = input.nextDouble();

        // request user input
        System.out.print("Please give the number 2 :");

        // read user input and assign the variable
        number2 = input.nextDouble();
        // request user input
        System.out.print("Please give the number 3 :");

        // read user input and assign the variable
        number3 = input.nextDouble();
        // request user input
        System.out.print("Please give the number 4 :");

        // read user input and assign the variable
        number4 = input.nextDouble();

        // use the input

        total = number1 + number2 + number3 + number4 ;

        System.out.println("\nTotal = " + total);



    }



}
