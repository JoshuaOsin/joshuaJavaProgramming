package day30_CustomClass;

import java.util.ArrayList;

public class DigitsLettersSpecialCharacters {

    public static void main(String[] args) {

        String str = "ABCD1234%&/(456EFG";

        ArrayList <Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }

        ArrayList<Character> letters = new ArrayList<>(chars); // add all chars first
        letters.removeIf(p-> !Character.isLetter(p)); // then if not letter => remove them
        // remaining is the letters


        ArrayList<Character> digits = new ArrayList<>(chars); // add all chars first
        digits.removeIf(p-> !Character.isDigit(p)); // then if not digits => remove them
        // remaining is the digits


        ArrayList<Character> specialChars = new ArrayList<>(chars); // add all chars first
        specialChars.removeAll(letters); // then if not letter => remove them
        specialChars.removeAll(digits); // then if not digits => remove them
        //digits.removeIf(p-> !Character.isLetterOrDigit(p));
        // remaining is the special chars


        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }


}
