package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList < Integer > list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            list.set( i, list.get(i) *2);
        }

        System.out.println(list);

        System.out.println("----------");

        ArrayList < String > employees = new ArrayList<>(); // declare ArrayList

        employees.add("Joshua");
        employees.add("AAAAAA");
        employees.add("BBBBB");
        employees.add("Dijar");
        employees.add("Hajira");
        employees.add("Iroda");
        employees.add("Vasilica");
        employees.add("Eyup");
        employees.add("Ugur");
        employees.add("Ugur");
        employees.add("Remo");

        System.out.println(employees);

        employees.remove(1); // size will be decrease
        System.out.println(employees);

        employees.remove(1); // size will be decrease
        System.out.println(employees);

        boolean isRemoved = employees.remove("Remo"); // size will be decrease
        System.out.println("isRemoved = " + isRemoved); // ?????????????

        System.out.println(employees);


        System.out.println("------------------");

        ArrayList < Character > characters = new ArrayList<>();

        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        characters.add('E');
        characters.add('A');
        characters.add('A');

        int indexOfA = characters.indexOf('A');
        int lastIndexOfA = characters.lastIndexOf('A');

        System.out.println("indexOfA = " + indexOfA);
        System.out.println("lastIndexOfA = " + lastIndexOfA);

    }
}
