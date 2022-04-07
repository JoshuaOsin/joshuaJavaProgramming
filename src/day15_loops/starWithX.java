package day15_loops;

import java.util.Scanner;

public class starWithX {
    public static void main(String[] args) {
        System.out.println("enter a word");
        String word = new Scanner(System.in).next();

        if (word.charAt(0) == 'x') {
            word = word.replaceFirst("x","a");
        }
        System.out.println(word);
    }
}
