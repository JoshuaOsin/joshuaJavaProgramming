package week05;

public class StringMethods {

    public static void main(String[] args) {

        String today = " I coded a lot of [Java] today";

        String word = today.substring(today.indexOf("[")+1, today.indexOf("]"));

        System.out.println(word);


    }


}
