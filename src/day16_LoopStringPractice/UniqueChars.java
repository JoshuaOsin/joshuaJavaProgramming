package day16_LoopStringPractice;

import java.util.Scanner;

public class UniqueChars {

    public static void main(String[] args) {
        System.out.println("Enter String :");
        String word = new Scanner(System.in).nextLine();

        String result = "";

        for (int i = 0; i <  word.length() ; i++) {
            String ch = ""+ word.charAt(i);

            if (word.indexOf(ch) == word.lastIndexOf(ch) ) { // first and last index number is equal then
                                                            // char is unique
                result += ch;
            }
        }
        System.out.println("word = " + word);
        System.out.println("result = " + result);
    }
}
