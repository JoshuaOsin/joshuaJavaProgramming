package week07;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aabcccd";
        String result = ""; // a2b1c3d1

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // i= 0 then ch= 'a'

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }

                // if we have char previously skip adding
                if (result.contains("" + ch)) {
                    continue;
                }
                result += ch;
                result += count;
        }
        System.out.println("result = " + result);
    }
}
/*
- Iterate over given String
- Outer loop to get each char
- inner loop
 */