package day19_RecapLoop_String;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aabccdeef";
        String result = ""; // bdf

        for (int j = 0; j <str.length(); j++) {

            char ch = str.charAt(j); //bring the char for inner loop
            int count = 0; // represents of frequency of char

            for (int i = 0; i < str.length(); i++) { // compare the char from outer loop
                char each = str.charAt(i);
                if (ch == each) {
                    count++;
                }
            }
            if (count == 1) { // char is unique
                result += ch;
            }

        }
        System.out.println("result = " + result);
    }
}
/*
Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf
 */