package day17_While_Do_While;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = scan.nextInt();
        while (!(age>0 && age <=120) ){
            System.out.print("Invalid Entry, Please re-enter your age : ");
            age = scan.nextInt();
        }

        System.out.println("Are you a US citizen? Yes / No ");
        String answer = scan.next();

        while (!(answer.equalsIgnoreCase("yes") ||
                answer.equalsIgnoreCase("no"))) {
            System.out.print("Invalid Entry, Are you a US citizen? Yes / No  : ");
            answer = scan.next();
        }

        if (age >= 18 && answer.equalsIgnoreCase("yes")) {
            System.out.println("Eligibale to vote");
        } else{
            System.out.println("Not eligible to vote");
        }
    }
}
