package day15_loops;

import java.util.Scanner;

public class replaceX {
    public static void main(String[] args) {

        System.out.println("enter a word");
        String word = new Scanner(System.in).next();

        word = word.replace("x","a").replace("X","A");
        System.out.println(word);
    }
}
