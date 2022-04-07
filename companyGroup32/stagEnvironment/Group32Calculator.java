package stagEnvironment;

import java.util.Scanner;

public class Group32Calculator {
    public static void main(String[] args) {
        String ANSI_RED = "\u001B[31m";
        String ANSI_RESET = "\u001B[0m";
        //******* Welcome Display ****************
        System.out.println(ANSI_RED + "\nWelcome Group32 Software Company’s Calculator" + ANSI_RESET);
        System.out.println("1\t2\t3\t4\t5\t6\t7\t8\t9\t0\t.\tC");
        System.out.println("/\t*\t+\t-");

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

            //********* Error display ***********
            while (mathOperator != '+' && mathOperator != '-' && mathOperator != '*' && mathOperator != '/'
                    && Character.toUpperCase(mathOperator) != 'C') {

                System.out.print("Please re-enter the correct operator\t: ");
                mathOperator = scan.next().toUpperCase().charAt(0);

            }

            if (Character.toUpperCase(mathOperator) == 'C')
                continue; // Go back to STEP 1

            //********* STEP 3 second value ***********
            System.out.print("Please give the second value\t: ");
            secondNumber = scan.nextDouble();

            //********* STEP 4 Confirmation ***********
            System.out.print("Please confirm the calculation (Y/N) ");
            isUserConfirm = scan.next().toUpperCase().charAt(0);  // 3. Reassign Y /N  C

            //********* Error display ***********
            while (isUserConfirm != 'Y' && isUserConfirm != 'N' && isUserConfirm != 'C') {

                System.out.print("Please re-enter the confirmation (Y/N)");
                isUserConfirm = scan.next().toUpperCase().charAt(0);  // 3. Reassign Y /N  C

            }

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
        //************** Result Display ***************
        System.out.println(firstNumber + " " + mathOperator + " " + secondNumber + " = " + result);
        System.out.println(ANSI_RED + "Thanks for using Group32 Software Company’s Calculator"+ ANSI_RESET);

        System.exit(0);
    }
}
