package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {
        double [] numbers = {1.2,2.3,3.4,4.5};
        numbers = replaceAll(numbers, 1.2, 1.5);
        System.out.println(Arrays.toString(numbers));
    }

    // replaces all the element of the array that matching with the given old element, return array
    public static int[] replaceAll ( int[] array, int oldValue, int newValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }
    
    // replaces all the element of the array that matching with the given old element, return array
    public static double[] replaceAll ( double[] array, double oldValue, double newValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }

    // replaces all the element of the array that matching with the given old element, return array
    public static char[] replaceAll ( char[] array, char oldValue, char newValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }

    // replaces all the element of the array that matching with the given old element, return array
    public static String[] replaceAll ( String[] array, String oldValue, String newValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)) {
                array[i] = newValue;
            }
        }
        return array;
    }
}
