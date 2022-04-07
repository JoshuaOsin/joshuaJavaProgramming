package day09_IfStatements;

import java.util.Scanner;

public class NameOfTheDay {
    public static void main(String[] args) {
        // Create scanner object
        Scanner inputInteger = new Scanner(System.in);
        // request user input
        System.out.print("Please put which day :");
        // create int variable, read user input and assign the int
        int numberOfDay = Integer.parseInt(inputInteger.next());

        // use the input
        if (numberOfDay == 1) {
            System.out.println(numberOfDay + ". day of week is Monday");
        } else if (numberOfDay == 2)

        {
            System.out.println(numberOfDay + ". day of week is Tuesday");
        } else if (numberOfDay == 3)

        {
            System.out.println(numberOfDay + ". day of week is Wednesday");
        } else if (numberOfDay == 4)

        {
            System.out.println(numberOfDay + ". day of week is Thursday");
        } else if (numberOfDay == 5)

        {
            System.out.println(numberOfDay + ". day of week is Friday");
        } else if (numberOfDay == 6)

        {
            System.out.println(numberOfDay + ". day of week is Saturday");
        } else if (numberOfDay == 7)

        {
            System.out.println(numberOfDay + ". day of week is Sunday");
        } else {
            System.out.println("unfortunately wrong input");
        }


    }

}


