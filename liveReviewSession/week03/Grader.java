package week03;

import java.util.Scanner;

public class Grader {
    public static void main(String[] args) {
        // for a given grade assign Letter Grades A = 90-100, B= 80-89, C=70-79, D =60-69

        // Create scanner object and create variables
        Scanner input = new Scanner(System.in);
        int score;

        // request user input
        System.out.print("Please give the score  :");
        // read user input and assign the variable
        score = input.nextInt();
        if (score<0||score>100) {
            System.err.println("Not a valid entry");
        } else if (score>89) {
            System.out.println("A");
        } else if (score>79){
            System.out.println("B");
        } else if (score>69){
            System.out.println("C");
        } else if (score>59){
            System.out.println("D");
        } else {
            System.out.println("F");
        }



    }
}
