package day16_LoopStringPractice;

public class Palindrome {

    public static void main(String[] args) {

        String word = "Cydeo";
        String reversed = "";

        for (int i = word.length()-1; i >= 0 ; i--) {
            reversed += word.charAt(i);
        }

        boolean isPalindrome = reversed.equalsIgnoreCase(word);

        System.out.println("isPalindrome = " + isPalindrome);
    }
}
