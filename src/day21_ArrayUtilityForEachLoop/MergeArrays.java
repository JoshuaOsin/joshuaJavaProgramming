package day21_ArrayUtilityForEachLoop;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {

        String[] group1 = {"Günay", "Anna", "Anna", "Zuhal", "Maria", "Sinem"};
        String[] group2 = {"Joshua", "Iroda", "Dijar", "Hajira", "Vasillica", "Ugur"};

        String[] allGroups = new String[group1.length + group2.length];

        int i = 0;
        for (String each : group1) {
            allGroups[i] = each;
            i++;
        }
        for (String each : group2) {
            allGroups[i++] = each;
        }
        System.out.println(Arrays.toString(allGroups));

        System.out.println("------------------------");


    }
}
