package day17_While_Do_While;

public class FrequencyOfWord {

    public static void main(String[] args) {
        String word = "cat cat CAT dog dog cat";
        word = word.toLowerCase();

        int frequency =0;
        while (word.contains("cat")) {
            word = word.replaceFirst("cat","");
            frequency++;
        }
        System.out.println(frequency);
        System.out.println(word.trim());
    }
}
