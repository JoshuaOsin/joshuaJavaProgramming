package day21_ArrayUtilityForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        char[] ch1 = {'a','b','c',};
        char[] ch2 = {'a','c','b',};

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println("anagram = " + anagram);

        System.out.println("--------------------");

        String str1 = "abcd";
        String str2 = "dcba";

        char[] ch3 = str1.toCharArray();
        char[] ch4 = str2.toCharArray();

        System.out.println(Arrays.toString(ch3));
        System.out.println(Arrays.toString(ch4));

        Arrays.sort(ch3);
        Arrays.sort(ch4);

        if (Arrays.equals(ch3,ch4)) {
            System.out.println("Anagram");
        }

    }
}
