package day51_Map_Enum;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "bbcccaaaaa";
        //           bca
        //           235
        //Collections.frequency()

        // we create String array and store chars of a given string
        String[] chars= str.split("");

        Map<String,Integer> result = new LinkedHashMap<>();

        for (String each : chars) {
            int frequency = Collections.frequency(Arrays.asList(chars),each);
            result.put(each, frequency);
        }

        System.out.println(result);

    }
}
