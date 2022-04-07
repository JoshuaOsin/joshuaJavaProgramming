package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementToArray_Overloading {
    public static void main(String[] args) {
        int [] array ={1,2,3,4};
        int element = 5;

        array = addElemen(array,element);
        System.out.println(Arrays.toString(array));

        System.out.println("----------------------");

        double [] arr2 = {1.5, 2.3, 3.5, 4.5};
        arr2 = addElement(arr2, 5.5);
        System.out.println(Arrays.toString(arr2));

        System.out.println("-----------------------");
        String [] names = {"Joshua", "Iroda", "Hajira", "Dijar"};
        names = addElement(names, "Ugur");
        System.out.println(Arrays.toString(names));

        System.out.println("-----------------------");
        char [] letters = { 'J', 'o', 's', 'h','u'};
        letters = addElement(letters, 'a');
        System.out.println(Arrays.toString(letters));
    }

    public static int[] addElemen(int[] array, int element) {
        int[] result = new int[array.length+1];

        int i =0;
        for (int each : array) {
            result [i++]= each; // post increment to keep track of elements of array
        }
        result [i]= element;
        return result;
    }

    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length+1];

        int i =0;
        for (double each : array) {
            result [i++]= each; // post increment to keep track of elements of array
        }
        result [i]= element;
        return result;
    }

    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length+1];

        int i =0;
        for (String each : array) {
            result [i++]= each; // post increment to keep track of elements of array
        }
        result [i]= element;
        return result;
    }

    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length+1];

        int i =0;
        for (char each : array) {
            result [i++]= each; // post increment to keep track of elements of array
        }
        result [i]= element;
        return result;
    }
}
