package day11_SwitchScanner;

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

        switch (numberOfMonth){ // 1,2,3,4,5,6,7,8,9,10,11,12
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month ="Invalid Entry";
        }

        System.out.println(month);
        /*
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
*/

    }
}
