package day27_WrapperClasses;

import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Please enter valid password");
            String password = scan.next();

            if (password.length() < 8) {
                System.out.println("your password if too short");
            } else if (!isContainUpperCase(password) ||
                    !isContainLowerCase(password) ||
                    !isContainDigit(password) ||
                    !isContainSpecialCharacter(password)) {
                System.out.println("not valid password");
            } else {
                System.out.println("valid Password");
                break;
            }
        }
    }

    // check if the given String has uppercase letter, returns boolean
    public static boolean isContainUpperCase(String str) {

        boolean result = false;

        for (char each : str.toCharArray()) {

            if (Character.isUpperCase(each)) {
                result = true;
                break;
            }
        }
        return result;
    }

    // check if the given String has lowercase letter, returns boolean
    public static boolean isContainLowerCase(String str) {

        boolean result = false;

        for (char each : str.toCharArray()) {

            if (Character.isLowerCase(each)) {
                result = true;
                break;
            }
        }
        return result;
    }

    // check if the given String has digit, returns boolean
    public static boolean isContainDigit(String str) {

        boolean result = false;

        for (char each : str.toCharArray()) {

            if (Character.isDigit(each)) {
                result = true;
                break;
            }
        }
        return result;
    }

    // check if the given String has special characters, returns boolean
    public static boolean isContainSpecialCharacter(String str) {

        boolean result = false;

        for (char each : str.toCharArray()) {
            if (!Character.isLetterOrDigit(each)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
/*
PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
 */