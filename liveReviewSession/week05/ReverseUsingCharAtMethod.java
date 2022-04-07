package week05;

import java.util.Scanner;

public class ReverseUsingCharAtMethod {

    public static void main(String[] args) {

        //PIQ for JAVA how do you implement polindrome?

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word (3-5 letters): ");
        String word = scan.next();

        int lenghtOfWord = word.length();
        //System.out.println(lenghtOfWord);

        String reverseWord = "";

        switch (lenghtOfWord) {
            case 5:
                reverseWord += word.charAt(lenghtOfWord - 1);
                reverseWord += word.charAt(lenghtOfWord - 2);
                reverseWord += word.charAt(lenghtOfWord - 3);
                reverseWord += word.charAt(lenghtOfWord - 4);
                reverseWord += word.charAt(lenghtOfWord - 5);
                break;
            case 4:
                reverseWord += word.charAt(lenghtOfWord - 1);
                reverseWord += word.charAt(lenghtOfWord - 2);
                reverseWord += word.charAt(lenghtOfWord - 3);
                reverseWord += word.charAt(lenghtOfWord - 4);
                break;
            case 3:
                reverseWord += word.charAt(lenghtOfWord - 1);
                reverseWord += word.charAt(lenghtOfWord - 2);
                reverseWord += word.charAt(lenghtOfWord - 3);
                break;
            default:
                System.out.println("word is too long or short");
        }
        if (reverseWord.equals(word)) {
            System.out.println("this word is polindrome");
        } else
            System.out.println("this word is not polindrome");

        scan.close();
    }
}

