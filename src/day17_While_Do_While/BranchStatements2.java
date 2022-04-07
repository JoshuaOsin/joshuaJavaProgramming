package day17_While_Do_While;

import java.util.Scanner;

public class BranchStatements2 {
    public static void main(String[] args) {

        for (char ch = 'A'; ch <= 'E'; ch++) {
            if (ch == 'C') {
                continue; // skip following statements inside loop
            }
            System.out.print(ch + " ");

        }
        System.out.println();
        System.out.println("--------Even Numbers --------");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("--------Odd Numbers --------");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}

