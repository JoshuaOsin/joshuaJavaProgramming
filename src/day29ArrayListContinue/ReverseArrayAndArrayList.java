package day29ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6};

        int [] result = new int[array.length];

        for (int i = 0, j= array.length-1; i < array.length ; i++, j--) {
            result [i] = array[j];
        }

        System.out.println(Arrays.toString(result));

        System.out.println("------ ArrayList reverse-------");

        ArrayList <Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7));

        ArrayList <Integer> reversed = new ArrayList<>();


        for (int i = list.size()-1 ; i >= 0 ; i--) {
            int each = list.get(i);
            reversed.add(each);
        }

        System.out.println(reversed);
    }
}
