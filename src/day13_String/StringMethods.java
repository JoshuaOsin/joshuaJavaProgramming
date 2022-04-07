package day13_String;

public class StringMethods {
    public static void main(String[] args) {

        // charAt(index) 0,1,2,3,4
        String word = "Cydeo";
        char thirdChar = word.charAt(2); // d
        System.out.println("thirdChar = " + thirdChar);

        // lenght()
        String s1 = "EU8 is the best batch";
        int totalChar = s1.length();
        System.out.println("totalChar = " + totalChar); // 21

        char lastChar = s1.charAt(totalChar-1); // last index number equels totalChar-1
        System.out.println("lastChar = " + lastChar);

        // toUpperCase or toLowerCase
        String s2 = "Wooden Spoon";
        s2.toUpperCase();// s2 is immutable so not changed
        System.out.println("s2 = " + s2);
        System.out.println("Upper Case: "+ s2.toUpperCase());

    }
}
