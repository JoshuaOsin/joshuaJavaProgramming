package day25_CustomMethods_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String name = "Java Programing Language";

        StringUtility.printEachChar(name);

        String reverse = StringUtility.reverse(name);
        System.out.println(reverse);

        System.out.println("--------------------");
        String word = "Civic";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);

        System.out.println("------------------------");

        String [] names = { "Anna","Ansa","Aena","Asninsa" };

        int count =0;
        for (String each : names) {
            if (StringUtility.isPalindrome(each)) {
                count++;
            }
        }
        System.out.println("count = " + count);

        System.out.println("-----------");

        String str2 = "aaaabbbcccdsefffff";
        System.out.println(StringUtility.removeDuplicates(str2));
    }


}
