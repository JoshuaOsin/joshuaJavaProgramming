package day14_StringMethods;

public class Stringmethod2 {
    public static void main(String[] args) {

        String str = "I love Java Java Java";
        String str2 = str.replaceAll("a", "c");
        System.out.println("str2 = " + str2);

        String str4 = "Hello World";
        str4.trim();
        int z = str4.indexOf(" ");
        System.out.println("z = " + z);

        /*
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "joshua@yahoo.com";
        email = email.replace("yahoo", "gmail");
        System.out.println("email = " + email);

        String  sentence = "java java java java";
        sentence = sentence.replaceFirst("java", "C++");
        System.out.println("sentence = " + sentence);

         */
    }
}
