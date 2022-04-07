package day14_StringMethods;

public class StringMethod3SubString {
    public static void main(String[] args) {

        String word = "Cydeo Company";

        String brand = word.substring(0, 4 + 1);
        System.out.println("brand = " + brand);

        String str1 = word.substring(6);
        System.out.println("str1 = " + str1);

        System.out.println("----------------------------");
        String word2 = "Java Programming Language";

        String s1 = word2.substring(0, word2.indexOf(" "));
        String s2 = word2.substring(word2.indexOf(" ") + 1, word2.lastIndexOf(" "));
        String s3 = word2.substring(word2.lastIndexOf(" ") + 1);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

/*
        if (String method before nextLine()) {
            if (it is nextLine() ){
                NO NEED TO USE EXTRA nextLine()
            } else { // it is not nextLine()
                USE EXTRA nextLine()
            {
         {
 */
    }


}

