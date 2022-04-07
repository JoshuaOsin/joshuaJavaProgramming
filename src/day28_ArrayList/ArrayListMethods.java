package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList < Integer > numbers = new ArrayList<>();

        numbers.add(10); // 0
        numbers.add(20); // 1
        numbers.add(30); // 2 shift to 3
        numbers.add(40); // 3 shift to 4
        numbers.add(50); // 4 shift to 5
        numbers.add(2,25); // 2 then rest shift one

        System.out.println(numbers);

        System.out.println(numbers.size());

        int lastIndex = numbers.size() -1 ;

        System.out.println("----  get()  ------");

        Integer num = numbers.get(3);
        int num2 = numbers.get(4);   //unboxing

        System.out.println("-----------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("----- set ---------");

        ArrayList < String > students = new ArrayList<>(); // declare ArrayList

        students.add("Joshua");
        students.add("Dijar");
        students.add("Hajira");
        students.add("Iroda");
        students.add("Vasilica");
        students.add("Vasilica");

        System.out.println(students);

        students.set(5, "Ugur"); // replace the value of given index

        System.out.println(students);


    }
}
