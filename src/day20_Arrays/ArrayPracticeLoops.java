package day20_Arrays;

public class ArrayPracticeLoops {
    public static void main(String[] args) {
        char[] letters = new char[26];

        char ch = 'A';

        for ( int j = 0 ; j < letters.length; j++) {
            letters[j] = ch++;
            System.out.println(letters[j]);
        }
        System.out.println("----------------------");
    }
}
