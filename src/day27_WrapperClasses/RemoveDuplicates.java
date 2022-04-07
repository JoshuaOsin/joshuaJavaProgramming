package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int [] arr= {1,1,2,33,33,33,4};

        arr = removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }

    // remove the duplicated elements of given array, return array
    public static double[] removeDuplicates(double[] array) {
        
        double[] result = {};

        for (double each : array) {
            if (!ArraysUtility.contains(result,each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // remove the duplicated elements of given array, return array
    public static int[] removeDuplicates(int[] array) {

        int[] result = {};

        for (int each : array) {
            if (!ArraysUtility.contains(result,each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // remove the duplicated elements of given array, return array
    public static char[] removeDuplicates(char[] array) {

        char[] result = {};

        for (char each : array) {
            if (!ArraysUtility.contains(result,each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // remove the duplicated elements of given array, return array
    public static String[] removeDuplicates(String[] array) {

        String[] result = {};

        for (String each : array) {
            if (!ArraysUtility.contains(result,each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
    
}
