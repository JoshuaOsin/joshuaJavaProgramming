package week09;

import java.util.Scanner;

public class CalculatorVer2 {
    public static void main(String[] args) {

        //******* Welcome Display ****************
        welcomeMessage ();

        //************ Entry Display **************
        Scanner scan = new Scanner(System.in); // Create an Scanner for user input
        double firstNumber = 0;   //Declare double for first value
        double secondNumber = 0;  //Declare double for second value
        char mathOperator = ' ';  //Declare char for arithmetic operator
        char isUserConfirm = ' '; //Declare char for user confirmation
        double result = 0;


        while(true){
            //********* STEP 1 first value  ***********
            System.out.print("Please give the first value\t\t: ");
            firstNumber = scan.nextDouble(); // 2. Initiliaze a variable by Scanner

            //********* STEP 2 arithmetic operator *****
            System.out.print("Please provide an operator\t\t: ");
            mathOperator = scan.next().toUpperCase().charAt(0);  // 3. Reassign + - * / C

            //********* Check operator and display error if any ***********
            checkOperator(mathOperator);

            if (Character.toUpperCase(mathOperator) == 'C')
                continue; // Go back to STEP 1

            //********* STEP 3 second value ***********
            System.out.print("Please give the second value\t: ");
            secondNumber = scan.nextDouble();

            //********* STEP 4 Confirmation ***********
            System.out.print("Please confirm the calculation (Y/N) ");
            isUserConfirm = scan.next().toUpperCase().charAt(0);  // 3. Reassign Y /N  C

            //********* Check confirm and display error if any ***********
            checkConfirm (isUserConfirm);

            if (Character.toUpperCase(isUserConfirm) == 'C')
                continue; // Go back to STEP 1

            if (Character.toUpperCase(isUserConfirm) == 'N')
                main(args); // Restart Calculator

            //System.out.println("isUserConfirm = " + isUserConfirm);

            break;
        }
        //****** Arithmetic Operators Integration ****

        switch (mathOperator) {
            case '+':  //******** Addition **********
                result = addition(firstNumber , secondNumber);
                break;
            case '-':  //******** Substruction ******
                result = substruction(firstNumber , secondNumber);
                break;
            case '*':  //******** Multiplication ****
                result = multiplication(firstNumber , secondNumber);
                break;
            case '/':  //******** Division **********
                result = division(firstNumber , secondNumber);
                break;
        }
        resultDisplay(firstNumber, mathOperator,secondNumber,result);
    }

    //******* Welcome Display ****************
    public static void welcomeMessage (){
        System.err.println("Welcome Group32 Software Company’s Calculator");
        System.out.println("1\t2\t3\t4\t5\t6\t7\t8\t9\t0\t.\tC");
        System.out.println("/\t*\t+\t-");
    }

    // ********* Check operator******************
    public static char checkOperator( char mathOperator) {

        Scanner scan = new Scanner(System.in);

        while (mathOperator != '+' && mathOperator != '-' && mathOperator != '*' && mathOperator != '/'
                && Character.toUpperCase(mathOperator) != 'C') {

            System.out.print("Please re-enter the correct operator\t: ");
            mathOperator = scan.next().toUpperCase().charAt(0);
        }
        return mathOperator;
    }
    //*********** Check Confirm ************
    public static char  checkConfirm (char isUserConfirm) {

        Scanner scan = new Scanner(System.in);

        while (isUserConfirm != 'Y' && isUserConfirm != 'N' && isUserConfirm != 'C') {

            System.out.print("Please re-enter the confirmation (Y/N)");
            isUserConfirm = scan.next().toUpperCase().charAt(0);  // 3. Reassign Y /N  C

        }
        return isUserConfirm;
    }

    // ******* Addition ********************
    public static double addition (double firstNumber, double secondNumber) {
        double result = firstNumber +secondNumber;
        return result;
    }
    // ******* Substruction ********************
    public static double substruction (double firstNumber, double secondNumber) {
        double result = firstNumber - secondNumber;
        return result;
    }
    // ******* Multiplication ********************
    public static double multiplication (double firstNumber, double secondNumber) {
        double result = firstNumber * secondNumber;
        return result;
    }
    // ******* Division ********************
    public static double division (double firstNumber, double secondNumber) {
        double result = firstNumber / secondNumber;
        return result;
    }

    //************** Result Display ***************

    public static void resultDisplay (double firstNumber, char mathOperator,double secondNumber, double result){
        System.out.println(firstNumber + " " + mathOperator + " " + secondNumber + " = " + result);
        System.err.println("Thanks for using Group32 Software Company’s Calculator");
        System.exit(0);
    }


}
