package day19_RecapLoop_String;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {

            System.out.println("Enter a number :");
            int num1 = scan.nextInt();

            if (num1 % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
            System.out.println("Would you like to continue? (yes/no)");
            String answer = scan.next();

            if (!(answer.equalsIgnoreCase("yes")
                    || answer.equalsIgnoreCase("no"))) {
                System.out.println("Invalid Entry");
                System.exit(0);
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thanks for using calculator");
                break;
            }
        }
    }
}
