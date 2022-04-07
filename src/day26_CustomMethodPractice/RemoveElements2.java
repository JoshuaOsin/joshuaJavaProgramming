package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements2 {

    public static void main(String[] args) {
        int [] numbers ={10,20,30,40,50,60};

        numbers= removeElement(numbers,3);

        System.out.println(Arrays.toString(numbers));

    }

    // remove the element
    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index > array.length-1) {
            System.err.println("Invalid Index : " +index);
            System.exit(0);
        }

        int[] result = {};

        for (int i = 0; i < array.length ;i++) {
            if (i != index) {
                result = ArraysUtility.addElement(result,array[i]);
            }
        }
        return result;
    }
}
