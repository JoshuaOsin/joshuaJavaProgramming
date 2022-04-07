package day13_String;

import java.util.Scanner;

public class LongString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("first name");
        String firstName = scan.next();

        System.out.println("last name");
        String lastName = scan.next();

        if ( firstName.length() > lastName.length() ){
            System.out.println("firstName is longer " + firstName);
        } else if  ( firstName.length() < lastName.length() ){
            System.out.println("lastName is longer " + lastName);
        } else{
            System.out.println("Both have same lenght");
        }

    }
}
