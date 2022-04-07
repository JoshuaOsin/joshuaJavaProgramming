package week05;

import java.util.Scanner;

public class EmailExampleFromReplit {

    public static void main(String[] args) {
/*
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter email: ");
        String email = scan.next();
*/
        String email = "joshua_osin@gmail.com";

        int indexOfName = email.indexOf("_");
        int indexofLastName = email.indexOf("@");
        int indexOfEmail = email.indexOf(".");

        System.out.println(email);
        String firstName = email.substring(0,indexOfName);
        String lastName = email.substring(indexOfName+1, indexofLastName);
        String domain = email.substring(indexofLastName+1, indexOfEmail);


        System.out.println("First Name "+ firstName.substring(0,1).toUpperCase()+firstName.substring(1));
        System.out.println("Last Name "+ lastName.substring(0,1).toUpperCase()+lastName.substring(1));
        System.out.println("Domain : "+ domain);
    }
}
