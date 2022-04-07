package day17_While_Do_While;

import java.util.Scanner;

public class BranchingStatement {
    public static void main(String[] args) {

        for (char ch = 'A'; ch <= 'Z'; ch++) {

            System.out.print(ch +" ");
            if (ch == 'F') {
                break;
            }
        }
        System.out.println();
        System.out.println("--------------------------");

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number :");
            int num = scan.nextInt();
            if (num < 0) {
                break;
            }

        }
    }
}
