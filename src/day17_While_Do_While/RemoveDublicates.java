package day17_While_Do_While;

public class RemoveDublicates {
    public static void main(String[] args) {
        String str = "AABBCC";

        String result = ""; // "ABC"

        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i);

            if (result.contains(ch)) {
                continue; //skips
            }
            result += ch;
        }
        System.out.println(result);
    }
}
