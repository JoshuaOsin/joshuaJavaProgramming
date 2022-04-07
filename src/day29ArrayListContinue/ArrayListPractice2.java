package day29ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Daniel", "Aaron", "Ahmed", "David", "Shay"));

        employees.retainAll(Arrays.asList("Ahmed", "David"));

        System.out.println(employees);


        System.out.println("--------------------------------------------------------------");

        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        // remove all names start with 'M'
        list.removeIf(p -> p.charAt(0) == 'M');

        // convert ArryList to array
        names = list.toArray(new String[0]);

        System.out.println(Arrays.toString(names));


    }
}

