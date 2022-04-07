package devEnvironment;

import java.util.Scanner;

public class B_EntryDisplay {
    public static void main(String[] args) {


        //************ Entry Display **************
        Scanner scan = new Scanner(System.in); // Create an Scanner for user input
        double firstNumber = 0;   //Declare double for first value
        double secondNumber = 0;  //Declare double for second value
        char mathOperator = ' ';  //Declare char for arithmetic operator
        char isUserConfirm = ' '; //Declare char for user confirmation


        //********* STEP 1 first value  ***********
        System.out.print("Please give the first value\t\t: ");
        firstNumber = scan.nextDouble(); // 2. Initiliaze a variable by Scanner

        //********* STEP 2 arithmetic operator *****
        System.out.print("Please provide an operator\t\t: ");
        mathOperator = scan.next().toUpperCase().charAt(0);  // 3. Reassign + - * / C

        //********* STEP 3 second value ***********
        System.out.print("Please give the second value\t: ");
        secondNumber = scan.nextDouble();

        //********* STEP 4 Confirmation ***********
        System.out.print("Please confirm the calculation (Y/N) ");
        isUserConfirm = scan.next().toUpperCase().charAt(0);  // 3. Reassign Y /N  C

        System.out.println("\n" + firstNumber + " " + mathOperator + " " + secondNumber);
        System.out.println("isUserConfirm = " + isUserConfirm);
    }
}
/*
Step 1: Please give the first value: (value must be written same line)
Step 2: Please provide the arithmetic operator:(operator must be written same line)
Step 3: Please give the second value:(value must be written same line)
Step 4: Please confirm the calculation (Y/N)

 System.out.print("\nPlease confirm the calculation (Y/N)");
        input = scan.next();
        // assign the first char of the string to confirmChar and make it uppercase
        char confirmChar = input.toUpperCase().charAt(0);

        // Test
        System.out.println(confirmChar);
 */