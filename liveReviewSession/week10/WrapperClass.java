package week10;

public class WrapperClass {

    public static void main(String[] args) {

        int num1 = 100;

        Integer num2 = num1; // Autoboxing: changing primitive to Wrapper Class type

        int num3 = num2; // un-boxing: Wrapper class to primitive type

        String str = "123";

        System.out.println(str+1);
        int num = Integer.parseInt(str); // we will us it a lot

        System.out.println(num+1);

        System.out.println("-----------parse-------");
        String price = "$27.16";
        price = price.substring(1);
        double priceInDouble = Double.parseDouble(price); // turns the value to primitive

        System.out.println(priceInDouble+10);

        System.out.println("------ valueOf-------");
        Double num4 = Double.valueOf(price);

        System.out.println(num4+10);

        //difference between Integer.parceInt and Integer.valueOf

        System.out.println("-------------- Character. methods-----");

        char ch = 'a';

        boolean isDigit = Character.isDigit(ch);

        System.out.println("isDigit"+isDigit);

        boolean isLetter = Character.isLetter(ch);
        System.out.println("isLetter"+ isLetter);


        System.out.println("---------------------");
        String str2 = "a1b2c3";

        int sumOfDigit =0;

        for (char each: str2.toCharArray()) {

            if (Character.isDigit(each)) {
                sumOfDigit += Integer.parseInt(""+each);
            }
        }
        System.out.println("sumOfDigit = " + sumOfDigit);

        System.out.println("----------------------");

        String str3 = "abcd1234!@#$efghi6789#$%^ABCD";
        String letters = "";
        String upperCaseLetters = "";
        String lowercaseletters = "";
        String digits = "";
        String specialChars = "";

        for (char each: str3.toCharArray()) { // char each primitive

            if (Character.isDigit(each)) { // auto boxing
                digits += each;
            } else if (Character.isLetter(each)) {
                letters += each;
                if (Character.isUpperCase(each)) {
                    upperCaseLetters += each;
                } else {
                    lowercaseletters += each;
                }
            } else {
                specialChars += each;
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("upperCaseLetters = " + upperCaseLetters);
        System.out.println("lowercaseletters = " + lowercaseletters);
        System.out.println("specialChars = " + specialChars);




    }
}
