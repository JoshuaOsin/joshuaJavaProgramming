package day29ArrayListContinue;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(list);

        list.removeIf( p -> p % 2 ==0 ); // Lambda expression

        System.out.println(list);

        System.out.println("------------------");

        ArrayList <String> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList("Java", "Pyhton", "JavaScript", "C#", "C++", "Java", "Java"));

        list2.removeIf( p -> p.startsWith("J"));

        System.out.println(list2);

        System.out.println("-----------");

        ArrayList <String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Anna","Level","Eye", "Java", "Pyhton", "Cydeo"));

        names.removeIf( name -> !StringUtility.isPalindrome(name));

        System.out.println(names);
    }
}
