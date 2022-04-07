package day16_LoopStringPractice;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String word = scan.nextLine();

        String reverse = "";
        for (int i = word.length()-1 ; i >= 0 ; i--) {
            reverse += word.charAt(i);
        }
        System.out.println("reverse = " + reverse);
    }
}
