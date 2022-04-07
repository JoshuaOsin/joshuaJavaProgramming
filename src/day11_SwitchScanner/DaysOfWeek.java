package day11_SwitchScanner;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        // Create scanner object
        Scanner inputInteger = new Scanner(System.in);
        // request user input
        System.out.print("Please put which day :");
        // create int variable, read user input and assign the int
        int numberOfDay = Integer.parseInt(inputInteger.next());

        // use the input

        switch (numberOfDay) { //1,2,3,4,5,6,7

            case 1:
                System.out.println("Monday");
                break; // exits the switch after executing the case block
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: // only gets executed if none of case is matching
                System.out.println("Invalid Entry");
                //break;  // no need since it is at the very end
        }

    }
}
