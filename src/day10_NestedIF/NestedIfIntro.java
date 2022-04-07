package day10_NestedIF;

import java.util.Scanner;

public class NestedIfIntro {
    public static void main(String[] args) {

        // Create scanner object and create variables
        Scanner input = new Scanner(System.in);
        int score;

        // request user input
        System.out.print("Please give the score  :");
        // read user input and assign the variable
        score = input.nextInt();

        //nested if means before checking grades we need pre-condition.


        if (score >=0  && score < 100) { // Score is valid or not
            if (score > 89) {
                System.out.println("A");
            } else if (score > 79) {
                System.out.println("B");
            } else if (score > 69) {
                System.out.println("C");
            } else if (score > 59) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        } else {
            System.err.println("Not a valid entry");
        }


    }
}
