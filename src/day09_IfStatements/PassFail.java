package day09_IfStatements;

import java.util.Scanner;

public class PassFail {

    public static void main(String[] args) {

        // Create scanner object
        Scanner inputInteger = new Scanner(System.in);
        // request user input
        System.out.print("Please put score :");
        // create int variable, read user input and assign the int
        int score = Integer.parseInt(inputInteger.next());

        // use the input

        if (score>60) {
            System.out.println("\nStudent passed");
        } else {
            System.out.println("\nStudent failed");

        }




    }




}
