package week05;

import java.util.Scanner;

public class emailCheckInterview {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Email");
        String email = scan.next();

        int indexOfDomain = email.indexOf("@");
        int indexOfFirstComma = email.indexOf(".");
        int indexOfLastComma = email.lastIndexOf(".");

        if (indexOfDomain < 1 || indexOfFirstComma < 1 // if no (@ or .), starts with them
                || indexOfDomain >= email.length()-3 // if there are 3 char after @ sign
                || indexOfDomain != email.lastIndexOf("@") // if there are two or more @
                || (indexOfLastComma +1) < indexOfDomain){ // if comma is the last char
            System.out.println("invalid email");
        } else
            System.out.println("valid email");
    }
}
/*
Your team has created a new bank website that requires email address to be validated.
The email string must contain an '@' character.
The email string must contain an '.' character.
The '@' must contain at least one character in front of it.
e.g. "a@example.com" is valid while "@example.com" is invalid.
The '.' and '@' must be in the appropriate places.
e.g. "mike.smith@com" is invalid while "mike.smith@example.com" is valid.
For a given string, find a solution that writes true on the console if an email is valid and false if it is invalid.
Examples:
str = "test@example.com" --> true
str = "test@example.co.in --> true
str = "@example.com" --> false
 */