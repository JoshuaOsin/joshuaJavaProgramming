package day29ArrayListContinue;

import java.util.ArrayList;

public class FirstUniqueElement {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(1);

        for (Integer each : list) { // outer loop

            int frequency = 0;

            for (Integer element : list) {// inner loop
                if (each == element) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.println(each);
                break;
            }
        }
    }
}
/*
Write a program that can return the first unique elements from an arraylist

			Do not use indexOf & lastIndexOf methods
 */