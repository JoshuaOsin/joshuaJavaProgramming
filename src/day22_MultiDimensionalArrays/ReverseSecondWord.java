package day22_MultiDimensionalArrays;

public class ReverseSecondWord {

    public static void main(String[] args) {

        String sentence = "I Love Java";

        String [] words = sentence.split(" ");
        // second word i =1 so that word[1]
        String  secondWord = words[1];

        String reverse = "";

        for (int i = secondWord.length()-1; i >=0 ; i--) {
            reverse += secondWord.charAt(i);
        }
        // print just reversed second word
        System.out.println(reverse);

        sentence = sentence.replaceFirst(words[1],reverse );
        // print all sentence which has reversed second word
        System.out.println("sentence = " + sentence);

        // second version
        words[1] = reverse;

        for (String word : words) {
            System.out.print(word + " ");
        }

    }
}
/*
2. Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";

			output:
				I evoL Java
 */