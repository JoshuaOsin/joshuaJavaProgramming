package day17_While_Do_While;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //************ Entry Display **************
        Scanner scan = new Scanner(System.in); // Create an Scanner for user input
        double firstNumber = 0;   //Declare double for first value
        double secondNumber = 0;  //Declare double for second value
        char mathOperator = ' ';  //Declare char for arithmetic operator
        double result = 0;
        char isUserConfirm = ' '; //Declare char for user confirmation


        //********* STEP 1 first value  ***********
        System.out.print("Please give the first value\t\t: ");
        firstNumber = scan.nextDouble(); // 2. Initiliaze a variable by Scanner

        //********* STEP 2 arithmetic operator *****
        System.out.print("Please provide valid operator\t\t: ");
        mathOperator = scan.next().toUpperCase().charAt(0);  // 3. Reassign + - * / C

        while (!(mathOperator == '+' || mathOperator == '-' ||
                mathOperator == '/' || mathOperator == '*')) {
            System.out.print("Please provide valid operator\t\t: ");
            mathOperator = scan.next().toUpperCase().charAt(0);  // 3. Reassign + - * / C
        }

        //********* STEP 3 second value ***********
        System.out.print("Please give the second value\t: ");
        secondNumber = scan.nextDouble();


        //****** Arithmetic Operators Integration ****

        switch (mathOperator) {
            case '+':  //******** Addition **********
                result = firstNumber + secondNumber;
                break;
            case '-':  //******** Substruction ******
                result = firstNumber - secondNumber;
                break;
            case '*':  //******** Multiplication ****
                result = firstNumber * secondNumber;
                break;
            case '/':  //******** Division **********
                result = firstNumber / secondNumber;
                break;
        }

        System.out.println( firstNumber + " " + mathOperator + " " + secondNumber + " = "+ result);
    }
}
