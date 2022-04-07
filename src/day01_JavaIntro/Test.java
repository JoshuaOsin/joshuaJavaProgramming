package day01_JavaIntro;

import day24_CustomMethodReturn.ReturnMethodIntro;
import day24_CustomMethodReturn.ReturnMethodPractice3;
import day24_CustomMethodReturn.ReturnMethodPractice4;
import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str = "aaasssdghnbbbbbbb";

        str = ReturnMethodPractice4.removeDuplicates(str);

        System.out.println(str);

        String name = "Java Programing";
        String reversedName = ReturnMethodIntro.reverse(name);
        System.out.println(reversedName);

        StringUtility.printEachChar(name);
    }
}
