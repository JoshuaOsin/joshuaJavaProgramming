package day08_IfStatements;

import java.util.Scanner;

public class NameOfTheMonth {

    public static void main(String[] args) {
        // Create scanner object
        Scanner inputInteger = new Scanner(System.in);
        // request user input
        System.out.println("Please give the number of month you started SDET EU8");
        // create int variable, read user input and assign the int
        int numberOfMonth = Integer.parseInt(inputInteger.next());

        // use the input

        //int numberOfMonth = 9; //this line could be used as well
        String month;
        if (numberOfMonth == 1) {
            //System.out.println("January");
            month ="January";
        } else if (numberOfMonth == 2) {
            month ="February";
        } else if (numberOfMonth == 3) {
            month ="March";
        } else if (numberOfMonth == 4) {
            month ="April";
        } else if (numberOfMonth == 5) {
            month ="May";
        } else if (numberOfMonth == 6) {
            month ="June";
        } else if (numberOfMonth == 7) {
            month ="July";
        } else if (numberOfMonth == 8) {
            month ="August";
        } else if (numberOfMonth == 9) {
            month ="September";
        } else if (numberOfMonth == 10) {
            month ="October";
        } else if (numberOfMonth == 11) {
            month ="November";
        } else  {
            month ="December";
        }
        System.out.println("month = " + month);
    }
}
/*
	1. write a program that can display the name of the month
			number = 1 ~ 12
 */
