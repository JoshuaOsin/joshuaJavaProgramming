package day09_IfStatements;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        // Create scanner object
        Scanner inputInteger = new Scanner(System.in);
        // request user input
        System.out.println("Please put year :");
        // create int variable, read user input and assign the int
        int year = Integer.parseInt(inputInteger.next());

        // use the input
        // int year =2000; // we can use this line instead of user input

        boolean leapYear = year % 4 == 0;

        if (leapYear) {
            System.out.println("Year " + year + " is a leap year");
        } else {
            System.out.println("Year " + year + " is NOT a leap year");

        }
    }


}
