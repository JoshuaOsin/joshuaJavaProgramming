package day10_NestedIF;

import java.util.Scanner;

public class NameOfTheMonths2 {
    public static void main(String[] args) {
        // Create scanner object
        Scanner inputInteger = new Scanner(System.in);
        // request user input
        System.out.println("Please give the number of month");
        // create int variables, read user input and assign the int
        int n = Integer.parseInt(inputInteger.next());

        String month = (n == 1) ? "Jan" : (n == 2) ? "Feb":(n == 3) ? "Mar":(n == 4) ? "Apr"
                :(n == 5) ? "May": (n == 6) ? "Jun":(n == 7) ? "Jul":(n == 8) ? "Aug"
                :(n == 9) ? "Sep": (n == 10) ? "Oct":(n == 11) ? "Nov":"Dec";
        System.out.println("month = " + month);
    }
}
