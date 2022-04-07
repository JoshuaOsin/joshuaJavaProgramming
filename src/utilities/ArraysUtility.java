package utilities;

import java.util.Arrays;

public class ArraysUtility {
    
    // print each interger array in seperate lines
    public static void printEachElement (int[] arr) {
        for (int each : arr) {
            System.out.println(each);
        }
    }

    // print each double array in seperate lines
    public static void printEachElement (double[] arr) {
        for (double each : arr) {
            System.out.println(each);
        }
    }

    // print each char array in seperate lines
    public static void printEachElement (char[] arr) {
        for (char each : arr) {
            System.out.println(each);
        }
    }

    // print each String array in seperate lines
    public static void printEachElement (String[] arr) {
        for (String each : arr) {
            System.out.println(each);
        }
    }

    //returns the maximum number from integer array
    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    //returns the maximum number from double array
    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    //returns the minimum number from integer array
    public static int min(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    //returns the minimum number from double array
    public static double min(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    // checks if the given integer is contained in the given integer array, returns boolean
    public static boolean contains(int[] array, int element) {
        boolean result = false;
        for (int each : array) {
            if (each == element) {
                result = true;
                break;
            }
        }
        return result;
    }

    // checks if the given char is contained in the given char array, returns boolean
    public static boolean contains(char[] array, char element) {
        boolean result = false;
        for (char each : array) {
            if (each == element) {
                result = true;
                break;
            }
        }
        return result;
    }

    // checks if the given double is contained in the given double array, returns boolean
    public static boolean contains(double[] array, double element) {
        boolean result = false;
        for (double each : array) {
            if (each == element) { // if array has same element
                result = true;
                break;
            }
        }
        return result;
    }

    // checks if the given String is contained in the given String array, returns boolean
    public static boolean contains(String[] array, String element) {
        boolean result = false;
        for (String each : array) {
            if (each.equals(element)) { // if array has same element
                result = true;
                break;
            }
        }
        return result;
    }

    // adds the given integer to integer array, return new array
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length+1];

        int i =0;
        for (int each : array) {
            result [i++]= each; // post increment to keep track of elements of array
        }
        result [i]= element;
        return result;
    }

    // adds the given doube to double array, return new array
    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length+1];

        int i =0;
        for (double each : array) {
            result [i++]= each; // post increment to keep track of elements of array
        }
        result [i]= element;
        return result;
    }

    // adds the given String to String array, return new array
    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length+1];

        int i =0;
        for (String each : array) {
            result [i++]= each; // post increment to keep track of elements of array
        }
        result [i]= element;
        return result;
    }

    // adds the given char to char array, return new array
    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length+1];

        int i =0;
        for (char each : array) {
            result [i++]= each; // post increment to keep track of elements of array
        }
        result [i]= element;
        return result;
    }

    // returns the frequency of given element from the given array
    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    // returns the frequency of given element from the given array
    public static int frequencyOfElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    // returns the frequency of given element from the given array
    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    // returns the frequency of given element from the given array
    public static int frequencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }
        return count;
    }

    // find the unique element of the given array, returns new array
    public static int[] uniqueElements(int[] array) {
        int[] result = {};

        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // find the unique element of the given array, returns new array
    public static double[] uniqueElements(double[] array) {
        double[] result = {};

        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // find the unique element of the given array, returns new array
    public static char[] uniqueElements(char[] array) {
        char[] result = {};

        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // find the unique element of the given array, returns new array
    public static String[] uniqueElements(String[] array) {
        String[] result = {};

        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // remove the index from the element, returns new array
    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index > array.length-1) {
            System.err.println("Invalid Index : " +index);
            System.exit(0);
        }

        int[] result = new int[array.length-1];

        int j = 0;

        for (int i = 0; i < array.length ;i++) {
            if (i == index) {
                continue; // for skipping
            }
            result[j++] = array[i];
        }
        return result;
    }

    // remove the index from the element, returns new array
    public static double[] removeElement(double[] array, int index) {

        if (index < 0 || index > array.length-1) {
            System.err.println("Invalid Index : " +index);
            System.exit(0);
        }

        double[] result = new double[array.length-1];

        int j = 0;

        for (int i = 0; i < array.length ;i++) {
            if (i == index) {
                continue; // for skipping
            }
            result[j++] = array[i];
        }
        return result;
    }

    // remove the index from the element, returns new array
    public static char[] removeElement(char[] array, int index) {

        if (index < 0 || index > array.length-1) {
            System.err.println("Invalid Index : " +index);
            System.exit(0);
        }

        char[] result = new char[array.length-1];

        int j = 0;

        for (int i = 0; i < array.length ;i++) {
            if (i == index) {
                continue; // for skipping
            }
            result[j++] = array[i];
        }
        return result;
    }

    // remove the index from the element, returns new array
    public static String[] removeElement(String[] array, int index) {

        if (index < 0 || index > array.length-1) {
            System.err.println("Invalid Index : " +index);
            System.exit(0);
        }

        String[] result = new String[array.length-1];

        int j = 0;

        for (int i = 0; i < array.length ;i++) {
            if (i == index) {
                continue; // for skipping
            }
            result[j++] = array[i];
        }
        return result;
    }

    // merge the given two arrays, returns the new array
    public static int[] merge(int[] arr1, int[] arr2) {
        int [] result = {};

        for (int each : arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (int each : arr2) {
            result = ArraysUtility.addElement(result,each);
        }
        return result;
    }

    // merge the given two arrays, returns the new array
    public static double[] merge(double[] arr1, double[] arr2) {
        double [] result = {};

        for (double each : arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (double each : arr2) {
            result = ArraysUtility.addElement(result,each);
        }
        return result;
    }

    // merge the given two arrays, returns the new array
    public static char[] merge(char[] arr1, char[] arr2) {
        char [] result = {};

        for (char each : arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (char each : arr2) {
            result = ArraysUtility.addElement(result,each);
        }
        return result;
    }

    // merge the given two arrays, returns the new array
    public static String[] merge(String[] arr1, String[] arr2) {
        String [] result = {};

        for (String each : arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (String each : arr2) {
            result = ArraysUtility.addElement(result,each);
        }
        return result;
    }

    // reverse the given array, return reversed array
    public static int[] reverse(int[] arr) {
        int [] reversed = new int[arr.length];
        for (int i = 0, j= arr.length-1; i < arr.length ; i++,j--) {
            reversed[i] = arr [j];
        }
        return reversed;
    }

    // reverse the given array, return reversed array
    public static double[] reverse(double[] arr) {
        double [] reversed = new double[arr.length];
        for (int i = 0, j= arr.length-1; i < arr.length ; i++,j--) {
            reversed[i] = arr [j];
        }
        return reversed;
    }

    // reverse the given array, return reversed array
    public static char[] reverse(char[] arr) {
        char [] reversed = new char[arr.length];
        for (int i = 0, j= arr.length-1; i < arr.length ; i++,j--) {
            reversed[i] = arr [j];
        }
        return reversed;
    }

    // reverse the given array, return reversed array
    public static String[] reverse(String[] arr) {
        String [] reversed = new String[arr.length];
        for (int i = 0, j= arr.length-1; i < arr.length ; i++,j--) {
            reversed[i] = arr [j];
        }
        return reversed;
    }

    // replace the element of the given index in array, returns array
    public static int[] replace(int[] array, int index, int newElement) {

        if (index <0 || index > array.length-1) {
            System.err.println("Invalid Index: " +index);
            System.exit(0);
        }

        array [index] = newElement;
        return array;
    }

    // replace the element of the given index in array, returns array
    public static double[] replace(double[] array, int index, double newElement) {

        if (index <0 || index > array.length-1) {
            System.err.println("Invalid Index: " +index);
            System.exit(0);
        }

        array [index] = newElement;
        return array;
    }

    // replace the element of the given index in array, returns array
    public static char[] replace(char[] array, int index, char newElement) {

        if (index <0 || index > array.length-1) {
            System.err.println("Invalid Index: " +index);
            System.exit(0);
        }

        array [index] = newElement;
        return array;
    }

    // replace the element of the given index in array, returns array
    public static String[] replace(String[] array, int index, String newElement) {

        if (index <0 || index > array.length-1) {
            System.err.println("Invalid Index: " +index);
            System.exit(0);
        }

        array [index] = newElement;
        return array;
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
