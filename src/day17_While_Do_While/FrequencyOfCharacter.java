package day17_While_Do_While;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String word = "AAABBBC";
        char ch ='A';
        int frequency =0;

        for (int i = 0; i < word.length(); i++) {
            if (ch == word.charAt(i)) {
                frequency++;
            }
        }
        System.out.println(word +" search :" +ch);
        System.out.println("frequency = " + frequency);

        String word2 = "Cat Cat Dog Cat";
        String searchWord = "cat";
        frequency=0;

        for (int i = 0; i <= word2.length()-3; i++) {
            if (searchWord.equalsIgnoreCase(word2.substring(i,i+3))) {
                frequency++;
            }
        }
        System.out.println(word2 +" search :" +searchWord);
        System.out.println("frequency = " + frequency);
    }
}
