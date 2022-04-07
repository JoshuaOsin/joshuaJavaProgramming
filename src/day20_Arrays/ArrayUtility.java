package day20_Arrays;

import java.util.Arrays;

public class ArrayUtility {
    public static void main(String[] args) {
        
        int[] numbers = {10, 3, 5, 22, 11};

        System.out.println(Arrays.toString(numbers));
        
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


    }
}
