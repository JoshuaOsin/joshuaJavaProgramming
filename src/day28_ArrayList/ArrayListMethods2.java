package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        ArrayList< Integer > list = new ArrayList<>();

        list.add(100);
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        Integer num  = 200;  // is an object
        boolean isRemoved = list.remove(num); // just first element

        System.out.println(list);
        System.out.println("isRemoved = " + isRemoved);

        list.clear(); // remove all the elements

        System.out.println(list.size());

        ArrayList< Integer > list1 = new ArrayList<>();

        list1.add(100);
        list1.add(100);
        list1.add(200);

        ArrayList< Integer > list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(100);

        boolean isEqual = list1.equals(list2); // order also important

        System.out.println("isEqual = " + isEqual);

        System.out.println("--------------------");

        boolean isEmpty = list1.isEmpty();

        System.out.println(isEmpty);

        list1.clear();

        System.out.println(" After clear " +isEmpty);

        ArrayList < Integer > numbers = new ArrayList<>();

        // Bulk operation
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(numbers);

    }
}
