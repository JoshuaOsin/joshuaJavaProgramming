package day24_CustomMethodReturn;

public class ReturnMethodIntro {

    // reverse the string
    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        String str = "Anna";

        String result = reverse(str);

        if (str.equalsIgnoreCase(result)) {
            System.out.println(str + " is palindrome");
        } else{
            System.out.println(str + " is not palindrome");
        }
    }
}

