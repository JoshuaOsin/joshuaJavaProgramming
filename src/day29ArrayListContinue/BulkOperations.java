package day29ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,6,7,8,9,10,3,3,3,3,5,5,5,5,8,8,8,8));

        System.out.println(list);

        list.removeAll(Arrays.asList(3,5,8));

        System.out.println(list);

        list.retainAll(Arrays.asList(1,2,6));

        System.out.println(list);

        list.addAll(Arrays.asList(1,2,3,4,5,6,6,7,8,9,10,3,3,3,3,5,5,5,5,8,8,8,8));

        boolean r1 = list.contains(8);
        boolean r2 = list.contains(2);
        boolean r3 = list.contains(6) && r1 &&r2;

        System.out.println("r3 = " + r3);

        boolean r4 = list.containsAll(Arrays.asList(8,2,6,10));

        System.out.println("r4 = " + r4);

        String [] names = {"Joshua", "Dijar", "Iroda", "Hajira"};

        /*
        ArrayList <String> namesList = new ArrayList<>();

        namesList.addAll(Arrays.asList(names));

        System.out.println(namesList);
        */
        // using Arrays.asList to convert Array to ArrayList
        ArrayList <String> namesList = new ArrayList<>(Arrays.asList(names));

        System.out.println("-----------------");

        int [] arr = {1,2,3,4,5,6,7,8,9};
        // we cannot primitive type Array to ArrayList by using asList
        ArrayList<Integer> list2 = new ArrayList<>();

        list2 = convertArrayToArrayList(arr);

        System.out.println(list2);

    }
    // converts primitive array to ArrayList, return ArrayList
    public static ArrayList<Integer> convertArrayToArrayList ( int [] arr) {
        ArrayList <Integer> list = new ArrayList<>();

        for (int each : arr) {
            list.add(each);
        }
        return list;
    }
}

/*
    BulkOperation MUST be a collection type

    addAll() ---> adds collection of values to the arraylist
    removeAll()--> removes collection of values to the arraylist
    retainAll()
    containsAll() --> check if all the elements are contained in the arraylist

    Arrays:
        asList (array of value) ---> returns the array as collection Type
 */