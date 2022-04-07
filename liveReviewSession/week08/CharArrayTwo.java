package week08;

import java.util.Arrays;

public class CharArrayTwo {

    public static void main(String[] args) {

        int [] countOfEachChar = new int[26]; // find number of each char

        /*
        word = acc
        [1,0,2,0.....]
         */

        String word = "silent";
        System.out.println("word = " + word);

        System.out.println("Before: "+ Arrays.toString(countOfEachChar));
        char [] letters = word.toCharArray();
        System.out.println( Arrays.toString(letters));

        for (char letter : letters) {
            countOfEachChar [ letter-97] =countOfEachChar [ letter-97] +1;
        }
        System.out.println("After: "+ Arrays.toString(countOfEachChar));

    }
}
