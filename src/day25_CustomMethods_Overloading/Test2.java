package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {


        int [] arr1 = {1,2,3,4,5,};
        ArraysUtility.printEachElement(arr1);
        int maxInt= ArraysUtility.max(arr1);
        System.out.println(maxInt);

        double [] arr2 = {1.5, 2.3, 3.5, 4.5};
        ArraysUtility.printEachElement(arr2);
        double maxDouble =  ArraysUtility.max(arr2);
        System.out.println("maxDouble = " + maxDouble);

        String [] names = {"Joshua", "Iroda", "Hajira", "Dijar"};
        ArraysUtility.printEachElement(names);

        char [] letters = { 'J', 'o', 's', 'h','u'};
        ArraysUtility.printEachElement(letters);


    }

}
