package day42_ExceptionsContinue;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {


        System.out.println("Enter you age:");

        int age = new Scanner(System.in).nextInt();

        if (age < 0) {
            throw new InputMismatchException("Age cannot be negative" + age);
        }

        if (age > 21) {
            System.out.println("Eligable");
        } else {
            throw  new RuntimeException("You must to be at least 21 years old");
        }

    }
}
