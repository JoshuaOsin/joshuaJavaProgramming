package day29ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindNthLargestNumber2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8));

        int n = 3;
        for (int i = 1; i < n; i++) { // starting from 1 to 2 will be executed => 1,2
            Integer maxNumber = Collections.max(list);
            list.removeAll(Arrays.asList(maxNumber)); // all 8's will be removed
            //list.remove(maxNumber);   // just one 8 will be removed
        }
        // after removing all 8's and 7's remaining max number is 6
        System.out.println(Collections.max(list));
    }
}
