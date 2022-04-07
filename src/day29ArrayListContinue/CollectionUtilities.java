package day29ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtilities {

    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,3,2,5,3,6,4,6,8,3));

        Collections.reverse(list);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        System.out.println("------------------");
        ArrayList <Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(10,20,30,40,50,60,70));

        int max = Collections.max(list2);
        System.out.println(max);
        int min = Collections.min(list2);
        System.out.println(min);

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));

        Collections.replaceAll(list4, 10, 1000);

        System.out.println(list4);

        System.out.println("-------------------------------------");

        int frequency = Collections.frequency(list4, 1000 );

        System.out.println("frequency = " + frequency);

        System.out.println("-------------------------------------");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Python", "Python", "Ruby", "C#", "Java"));

        int countJava = Collections.frequency(words, "Java");
        int countPython = Collections.frequency(words, "Python");

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);

    }
}
