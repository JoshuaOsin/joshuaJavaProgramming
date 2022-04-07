package day21_ArrayUtilityForEachLoop;

import java.util.Arrays;

public class ReverseNames {

    public static void main(String[] args) {

        String[] words = { "Java Programming", "Cydeo School", "Cydeo Company"};

        // reverse chars
        for (String each : words) {
            String reversed = "";
            for (int i = each.length()-1; i >=0 ; i--) {
                reversed += each.charAt(i); // reverse each char
            }
            System.out.println(reversed);
        }
        System.out.println("---------------------");
        // reverse Array
        String[] reversedArr = new String[words.length]; // enough capacity
        System.out.println(Arrays.toString(words));

        for (int i = words.length - 1, j =0 ; i >= 0; i--, j++) {
            reversedArr[i] = words[j];
            System.out.println(words[j]); // reverse each string
        }
        System.out.println(Arrays.toString(reversedArr));

    }
}
