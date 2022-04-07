package day21_ArrayUtilityForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

        String[] students = {"Günay", "Anna", "Cihad", "Zuhal", "Maria", "Sinem", "Aaron" };
        String[] earlyBird = Arrays.copyOf(students,3);

        System.out.println(Arrays.toString(earlyBird));

        System.out.println("------------------------------------------");

        String[] limitless = Arrays.copyOfRange(students, 3,students.length);
        System.out.println(Arrays.toString(limitless));

        System.out.println("----------------------------------------");

        char[] ch1 = { 'A','B','C','D','E','F','G','H','I'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2,6);
        System.out.println(Arrays.toString(ch2));

        char[] ch3 = "abc".toCharArray();
        System.out.println(Arrays.toString(ch3));

        int[] results = {10,20,30,40,50,60};
        int[] pass = Arrays.copyOfRange(results,5,results.length);
        System.out.println(Arrays.toString(pass));


    }
}
