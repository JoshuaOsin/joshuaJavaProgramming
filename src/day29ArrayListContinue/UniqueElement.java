package day29ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElement {

    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));

        ArrayList <Integer> unique = new ArrayList<>();

        for (Integer each : list) {
            int frequncy = Collections.frequency(list,each);
            if (frequncy == 1) {
                unique.add(each);
            }
        }

        System.out.println(unique);

        System.out.println("------------");

        ArrayList <Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));

        ArrayList <Integer> unique2 = new ArrayList<>(list2);

        unique2.removeIf( p -> Collections.frequency(list2, p) > 1); // remove not unique ones


        System.out.println("unique2 = " + unique2);
    }
}
