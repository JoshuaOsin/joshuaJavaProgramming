package day29ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabcccdeeef";

        String [] arr = str.split("");

        ArrayList <String> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println(list);

        String unique = "";

        for (String each : list) {

            int frequency = Collections.frequency(list, each);
            if (frequency == 1) {
                unique += each;
            }

        }

        System.out.println("unique = " + unique);


    }
}
