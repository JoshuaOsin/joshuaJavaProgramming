package day16_LoopStringPractice;

public class RemovedDuplicate {
    public static void main(String[] args) {
        String word = "AABBCCC";

        String result = "";

        for (int i = 0; i <  word.length() ; i++) {
            String ch = ""+ word.charAt(i);

            if (! result.contains(ch)) {
                result += ch;
            }
        }

        System.out.println("word = " + word);
        System.out.println("result = " + result);
    }
}
