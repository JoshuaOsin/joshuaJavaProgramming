package day16_LoopStringPractice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "Cyde012345Schoolé&%() ==WoodenSpoon";

        String digits = "";
        String letters = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') { // if number
                digits += ch;
            } else if (ch >= 'a' && ch <= 'z') { // if char a to z
                letters += ch;
            } else if (ch >= 'A' && ch <= 'Z') { // if char A to Z
                letters += ch;
            } else {            // not digit or letter -> special characters
                if (ch != ' ') { // if blank
                    specialChars += ch;
                }
            }
        }
        System.out.println("str = " + str);
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);

    }
}

