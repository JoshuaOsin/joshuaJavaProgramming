package day15_loops;

import java.util.Scanner;

public class replaceFullName {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("enter a  name: ");
        String name = scan.next();

        System.out.print("enter a  last name: ");
        String lastName = scan.next();

        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println("Full name = " + name + " "+ lastName);

    }
}
