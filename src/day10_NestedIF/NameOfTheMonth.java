package day10_NestedIF;

import java.util.Scanner;

public class NameOfTheMonth {

    public static void main(String[] args) {
        // Create scanner object
        Scanner inputInteger = new Scanner(System.in);
        // request user input
        System.out.println("Please give the number of month");
        // create int variables, read user input and assign the int
        int numberOfMonth = Integer.parseInt(inputInteger.next());
        String month = "" ; // initialize string with given empty ""

        // use the input
        //int numberOfMonth = 9; //this line could be used as well

        // nested if for pre-condition

        if (numberOfMonth >= 1 && numberOfMonth <= 12) { // valid input 1-12

            if (numberOfMonth == 1) {
                month = "January";
            } else if (numberOfMonth == 2) {
                month = "February";
            } else if (numberOfMonth == 3) {
                month = "March";
            } else if (numberOfMonth == 4) {
                month = "April";
            } else if (numberOfMonth == 5) {
                month = "May";
            } else if (numberOfMonth == 6) {
                month = "June";
            } else if (numberOfMonth == 7) {
                month = "July";
            } else if (numberOfMonth == 8) {
                month = "August";
            } else if (numberOfMonth == 9) {
                month = "September";
            } else if (numberOfMonth == 10) {
                month = "October";
            } else if (numberOfMonth == 11) {
                month = "November";
            } else {
                month = "December";
            }
        } else { // when input
            month = "Invalid entry";
        }

        System.out.println(month);
    }
}
/*
	1. write a program that can display the name of the month
			number = 1 ~ 12
 */
