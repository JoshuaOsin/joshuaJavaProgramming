package day21_ArrayUtilityForEachLoop;

import java.util.Arrays;

public class ArrayUtilityPractice {
    public static void main(String[] args) {

        int[] scores = {95,85,66,77,100};

        System.out.println(scores);

        System.out.println("-------------");
        System.out.println(Arrays.toString(scores));

        System.out.println("-------------");
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("minimum " + scores[0]);
        System.out.println("maximum " + scores[scores.length-1]);

        System.out.println("-------------");

        String[] names = { "Günay", "Anna", "ANNA", "Zuhal", "Maria", "Sinem"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));


        System.out.println("-------------");

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,3,2};
        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println("r1 = " + r1);
        Arrays.sort(arr2);
        boolean r2 = Arrays.equals(arr1,arr2);
        System.out.println("r2 = " + r2);
    }
}
