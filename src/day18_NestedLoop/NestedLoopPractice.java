package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        String a;

        while (true) {

            do {
                System.out.println("Please enter your age : ");
                age = scan.nextInt();
            }
            while (age >= 1 && age < 100);

            System.out.println("Would you like to continue? ");
            a = scan.next().toLowerCase();
            while (!(a.equals("yes") || a.equals("no"))) {
                System.out.println("ınvalid, please enter again?");
                a = scan.next().toLowerCase();
            }
            if (a.equals("yes")) {
                break;
            }
        }
        scan.close();
    }
}
