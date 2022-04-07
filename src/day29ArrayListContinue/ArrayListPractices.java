package day29ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractices {

    public static void main(String[] args) {

        String [] countries = {"Japan", "Korea", "United States", "Trkey", "United Kingdom", "Canada", "Germany"};

        //converting array to arrayList

        ArrayList <String> list = new ArrayList<>(Arrays.asList(countries));

        list.removeIf( p ->  p.length() >= 10);

        System.out.println(list);

        System.out.println("----- convert to array and print -------");

        // converting arrayList to array

        countries = list.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));
    }
}
