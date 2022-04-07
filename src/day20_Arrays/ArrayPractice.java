package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        //store 10,20,50,70 go with second way initialization
        int[] numbers = {10,20,50,70};

        System.out.println(Arrays.toString(numbers));

        System.out.println("---------------------------------");

        // create array for 5 score

        int[] scores = new int[5];
        scores[1] = 85;
        scores[scores.length-1] = 95;
        scores[3] = 75;
        scores[0] = 65;
        scores[2] = 55;

        System.out.println(Arrays.toString(scores));
    }
}
