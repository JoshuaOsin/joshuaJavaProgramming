package day26_CustomMethodPractice;

import utilities.ArraysUtility;

public class ReverseArray2 {

    // reverse the given array, return reversed array
    public static int[] reverse(int[] arr) {
        int [] result = {};

        for (int i = arr.length-1; i >=0 ; i--) {
            result = ArraysUtility.addElement(result,arr[i]);
        }
        return result;
    }
}
