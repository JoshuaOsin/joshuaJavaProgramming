package day28_ArrayList;

public class StrongPassword {

    public static void main(String[] args) {

        String password = "Cydeo1990@";

        boolean requirement1 = password.length()>= 8 && !password.contains(" ");
        boolean requirement2 = false; // Upper case
        boolean requirement3 = false; // lower case
        boolean requirement4 = false; // special character
        boolean requirement5 = false; // digit

        char [] chars = password.toCharArray();

        for (char each : chars) {
            if (Character.isUpperCase(each)) {
                requirement2 = true;
            } else if (Character.isLowerCase(each)) {
                requirement3 = true;
            } else if (Character.isDigit(each)) {
                requirement5 = true;
            } else {
                requirement4 = true;
            }
        }
        boolean isStrongPassword = requirement1 && requirement2 && requirement3 && requirement4 && requirement5;
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