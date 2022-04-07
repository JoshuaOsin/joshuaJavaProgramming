package qaEnvironment;

import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args) {


        //Create scanner for user inputs
        Scanner scan = new Scanner(System.in);

        // create while loop
        char confirmChar = ' ';
        do {
            // Step 1 first value
            System.out.print("Please give the first value: ");
            double firstNumber = scan.nextDouble();

            // Step 2 which arithmetic operator
            System.out.print("\nPlease provide the arithmetic operator: ");
            String input = scan.next();
            // assign the first char of the string to mathOperator
            char mathOperator = input.charAt(0);

            //Step 3 second value
            System.out.print("\nPlease give the second value: ");
            double secondNumber = scan.nextDouble();

            // Step 4 confirm
            System.out.println("\n" + firstNumber + " " + mathOperator + " " + secondNumber);
            System.out.print("\nPlease confirm the calculation (Y/N)");
            input = scan.next();
            // assign the first char of the string to confirmChar and make it uppercase
            confirmChar = input.toUpperCase().charAt(0);

            // Test
            System.out.println(confirmChar);
        }
        while (confirmChar == 'N');
    }

    private static void While(boolean b) {
    }
}
/*
Step 1: Please give the first value: (value must be written same line)
Step 2: Please provide the arithmetic operator:(operator must be written same line)
Step 3: Please give the second value:(value must be written same line)
Step 4: Please confirm the calculation (Y/N)

 */