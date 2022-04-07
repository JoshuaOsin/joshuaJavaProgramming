package week09;

public class CombineStrings {
    public static void main(String[] args) {
        System.out.println(combine("ab", "cdef"));
    }

    public static String combine(String str1, String str2) {

        String result = "";

        int i = 0;
        while (str1.length() > i || str2.length() > i) {
            if (str1.length() > i) {
                result += str1.charAt(i);
            }
            if (str2.length() > i) {
                result += str2.charAt(i);
            }
            i++;
        }
        return result;
    }
}
