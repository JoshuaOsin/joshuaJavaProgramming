package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Today is a good day to learn Java";

        String [] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        String reversedSentence = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence += words[i] +" ";
        }
        System.out.println(reversedSentence);
    }
}
