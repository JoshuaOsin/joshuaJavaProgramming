package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {


            System.out.println("Enter first Number:");
            int num = scan.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is even number");
            } else {
                System.out.println(num + " is odd number");
            }

            System.out.println("Would you like to check another number");
            String a = scan.next().toLowerCase();
            while (!(a.equals("yes") || a.equals("no"))) {
                System.err.println("Invalid entry, would you like to check another number");
                a = scan.next().toLowerCase();
            }

            if (a.equals("no")) {
                break;
            }
        }
    }
}
