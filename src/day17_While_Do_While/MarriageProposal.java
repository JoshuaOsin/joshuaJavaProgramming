package day17_While_Do_While;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me?");
        String answer = scan.next();

        while (!(answer.equalsIgnoreCase("yes")
                || answer.equalsIgnoreCase("no"))) {
            System.out.println("Invalid entry, please re-enter");
             answer = scan.next();
        }
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("congrats");
        } else{
            System.out.println("goodbye");
        }

    }
}
