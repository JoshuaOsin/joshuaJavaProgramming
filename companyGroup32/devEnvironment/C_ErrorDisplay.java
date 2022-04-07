package devEnvironment;

import java.util.Scanner;

public class C_ErrorDisplay {

    public static void main(String[] args) {

        //************ Entry Display **************
        Scanner scan = new Scanner(System.in); // Create an Scanner for user input
        double firstNumber = 0;   //Declare double for first value
        double secondNumber = 0;  //Declare double for second value
        char mathOperator = ' ';  //Declare char for arithmetic operator
        char isUserConfirm = ' '; //Declare char for user confirmation


        //******** Error Display ***********
        boolean isCharCorrect = false;     // + - * / C c -> true else false

        do { // STEP 1-4

            do { // STEP 1-2
                System.out.print("Please give the first value\t\t: ");
                firstNumber = scan.nextDouble(); // 2. Initiliaze a variable by Scanner

                do { // ONLY STEP 2
                    System.out.print("Please provide an operator\t\t: ");
                    mathOperator = scan.next().toUpperCase().charAt(0);  // 3. Reassign + - * / C
                    if (mathOperator == '+' || mathOperator == '-'
                            || mathOperator == '*' || mathOperator == '/'
                            || mathOperator == 'C') {
                        isCharCorrect = true;
                    } else {
                        System.err.println("not valid operator please enter again");
                    }
                } // check condition ONLY for STEP 2
                while (!isCharCorrect); // user needs to enter correct operator

            }  // check condition for STEP 1-2
            while (mathOperator == 'C');// User need to entry fist value

            isCharCorrect = false; // resetting boolean for next char input

            do { // STEP 3-4
                System.out.print("Please give the second value\t: ");
                secondNumber = scan.nextDouble();
                do { // ONLY STEP 4
                    System.out.print("Please confirm the calculation (Y/N) ");
                    isUserConfirm = scan.next().toUpperCase().charAt(0);  // 3. Reassign Y /N  C
                    if (isUserConfirm == 'Y' || isUserConfirm == 'N'
                            || isUserConfirm == 'C') {
                        isCharCorrect = true;
                    } else {
                        System.err.println("Not valid,Please confirm the calculation (Y/N)");
                    }
                }// check condition for STEP 4
                while (!isCharCorrect); // user needs to enter correct operator

                } // check condition for STEP 3-4
            while (isUserConfirm == 'C'); // User need to entry second value

        } // check condition for Steps 1-4
        while ( !(isUserConfirm == 'Y') );

    }
}

/*
      //******** Error Display ***********
Step 1: Please give the first value: (value must be written same line)
Step 2: Please provide the arithmetic operator:(operator must be written same line)
Step 3: Please give the second value:(value must be written same line)
Step 4: Please confirm the calculation (Y/N)

Error Display:
When the user enters ‘C’ or ‘c’ char at step 2 and step 4 ask the user to enter the value again.
When the user enters invalid operator at step 2 ask the user to enter the operator again
When the user enters ‘N’ or ‘n’ char at step 4, restart the calculator with a welcome message.

 */