package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice2 {
    public static void main(String[] args) {
        String confirmUser = "no";
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter first Number:");
            int num1 = scan.nextInt();
            System.out.println("Enter second Number:");
            int num2 = scan.nextInt();
            System.out.println("Addition : " + (num1+num2));
            do {
                System.out.println("would you like to continue ");
                confirmUser = scan.next();
            }
            while (!(confirmUser.equalsIgnoreCase("yes")
                    || confirmUser.equalsIgnoreCase("no")));

        } while (confirmUser.equalsIgnoreCase("yes"));
    }
}
