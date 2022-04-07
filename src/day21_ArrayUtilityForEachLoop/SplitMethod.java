package day21_ArrayUtilityForEachLoop;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {

        String str = "I love learning java programming language";

        String[] words= str.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("----------------------");

        String emailAdress = "WoodenSpoon@cydeo.com";

        String[] arr = emailAdress.split("@"); // split, it includes before and after chars
        String[] arr2 = emailAdress.split("\\."); // use \\ for special (.)



        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        String[] chars = emailAdress.split("");
        System.out.println(Arrays.toString(chars));


    }
}
