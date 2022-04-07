package day19_RecapLoop_String;

public class frequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aabcccd";
        String result = ""; // a2b1c3d1

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); // 'a'
            int count =0;

            for (int i = 0; i < str.length(); i++) {
                char eachChar= str.charAt(i);
                if (ch == eachChar) {
                    count++;
                }
            }
            if (result.contains(""+ch)) {
                continue;
            }
            result += ch;
            result+= count;
        }

        System.out.println("result = " + result);
    }
}
