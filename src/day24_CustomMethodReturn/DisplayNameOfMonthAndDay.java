package day24_CustomMethodReturn;

import java.util.Scanner;

public class DisplayNameOfMonthAndDay {
    //Create a method that can display the name of the month based on the given number to the method
    public static void displayNameOfMonthGivenNumber (int numberOfMonth){
        String month = "" ; // initialize string with given empty ""
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
    }

    //Create a method that can print how many days a month has
    public static void  displayDaysOfGivenMonth(int year, int number){

        if (!( number >= 0 && number <= 12 )) {
            return;
        } else {
            switch (number){
                case 2:
                    if (year %4 == 0){
                        System.out.println("29 days");
                    }else{
                        System.out.println("28 days");
                    }
                    break;
                case 9: case 4: case 6: case 11:
                    System.out.println("30 days");
                    break;
                default:
                    System.out.println("31 days");
            }
        }
    }

    // Create a method that can print the name of the day based on the given number to the method
    public static void displayNameOfDayGivenNumber (int numberOfDay){

        if (!( numberOfDay >= 1 && numberOfDay <= 7 )) {
            return;
        } else {
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
            }
        }

    }



    public static void main(String[] args) {
        // Create scanner object
        Scanner inputInteger = new Scanner(System.in);

        // request user input for year, month and day
        System.out.println("Please give which year");
        int year = Integer.parseInt(inputInteger.next());
        System.out.println("Please give the number of month");
        int numberOfMonth = Integer.parseInt(inputInteger.next());
        System.out.print("Please chose which day :");
        int numberOfDay = Integer.parseInt(inputInteger.next());

        // use our methods
        displayNameOfMonthGivenNumber(numberOfMonth);
        displayDaysOfGivenMonth(year, numberOfMonth);
        displayNameOfDayGivenNumber(numberOfDay);
    }
}
