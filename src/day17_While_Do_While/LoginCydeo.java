package day17_While_Do_While;

import java.util.Scanner;

public class LoginCydeo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        String  userName ="";
        String  passWord ="";
        String  validUserName ="Cydeo";
        String  validPassWord ="Cydeo123";

        for(int i = 1; i <= 3; i++){

        System.out.println("Please enter  user name");
        userName = scan.next();
        System.out.println("Please enter  password");
        passWord = scan.next();

        if (userName.equals(validUserName) && passWord.equals(validPassWord)){
            valid = true;
        } else{
            System.out.println("Invalid Entry Please try Again");
        }

            if(valid){
                System.out.println("Logged In");
                break;
            }

            if( i==2){
                System.out.println("This is your Last Chance");
            }
            if( i==3){
                System.out.println("Your account is locked");
            }

        }
        scan.close();

    }
}
