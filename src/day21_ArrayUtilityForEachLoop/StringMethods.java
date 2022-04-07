package day21_ArrayUtilityForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Java";
        char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars));

        for (char each : chars) {
            System.out.println(each);
        }


        String[] newStr= str.split("a");
        System.out.println(Arrays.toString(newStr));


    }
}
