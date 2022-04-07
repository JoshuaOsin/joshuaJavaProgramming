package day28_ArrayList;

public class StrongPassword2 {

    public static void main(String[] args) {

         String password = "Cydeo12.21";

         int countUpperCase = 0;
         int countLowerCase = 0;
         int countDigits = 0;
         int countSpecialChar = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if (Character.isUpperCase(each)) {
                countUpperCase++;
            } else if (Character.isLowerCase(each)) {
                countLowerCase++;
            } else if (Character.isDigit(each)) {
                countDigits++;
            } else {
                countSpecialChar++;
            }
        }
        boolean requirement1 = password.length()>= 8 && !password.contains(" ");
        boolean requirement2 = countUpperCase > 0;  // Upper case
        boolean requirement3 = countLowerCase > 0; // lower case
        boolean requirement4 = countSpecialChar > 0; // special character
        boolean requirement5 = countDigits > 0; // digits

        boolean isStrongPassword = requirement1 && requirement2 && requirement3 && requirement4 && requirement5;


    }
}
