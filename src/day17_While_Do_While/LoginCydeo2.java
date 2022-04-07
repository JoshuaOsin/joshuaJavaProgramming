package day17_While_Do_While;

import java.util.Scanner;

public class LoginCydeo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        String userName = "";
        String passWord = "";
        String validUserName = "Cydeo";
        String validPassWord = "Cydeo123";

        System.out.println("Please enter  user name");
        userName = scan.next();
        System.out.println("Please enter  password");
        passWord = scan.next();

        if (userName.equals(validUserName) && passWord.equals(validPassWord)) {
            System.out.println("Logged In");
        } else {
            int attemps = 3;
            while (!(userName.equals(validUserName) && passWord.equals(validPassWord)) && attemps > 0) {
                if (attemps == 1) {
                    System.out.println("Last chance");
                }
                System.out.println("Please enter  user name");
                userName = scan.next();
                System.out.println("Please enter  password");
                passWord = scan.next();
                attemps--;
            }

            if (userName.equals(validUserName) && passWord.equals(validPassWord)) {
                System.out.println("Logged In");
            } else {
                System.out.println("Your account is locked");
            }
        }
    }
}
