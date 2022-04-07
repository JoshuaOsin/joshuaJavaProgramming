package day13_String;

import java.util.Scanner;

public class FirstLastChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("first name");
        String firstName = scan.next();

        System.out.println("last name");
        String lastName = scan.next();

        System.out.println(firstName.charAt(0)+"."+lastName.charAt(0));

    }
}
