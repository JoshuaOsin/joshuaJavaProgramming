package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        String u = "";
        String p = "";
        String validu = "Cydeo";
        String validp = "Cydeo123";

        System.out.println("Please enter  user name");
        u = scan.next();
        System.out.println("Please enter  password");
        p = scan.next();
        valid = u.equals(validu) && p.equals(validp);
        if (valid) {
            System.out.println("Logged in");
        } else {
            for (int i = 1; i <= 2; i++) {
                System.out.println("Incorrect username or password: ");
                System.out.println("Please enter  user name");
                u = scan.next();
                System.out.println("Please enter  password");
                p = scan.next();
                valid = u.equals(validu) && p.equals(validp);
                if (valid) {
                    System.out.println("Logged in");
                    break;
                }
            }
            if (!valid) {
                System.out.println("Your account is locked");
            }
        }
        scan.close();
    }
}
