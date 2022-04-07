package day07_Operators;

public class ShorthandOperators {

    public static void main(String[] args) {

        // assignment operator = (it is not equal)
        int number = 100;
        System.out.println("number = " + number);

        number = 200;
        System.out.println("number = " + number);

        String word = "Java Programming";
        System.out.println("word = " + word);

        word = "Joshua loves his wife";
        System.out.println("word = " + word);

        word = "Java";
        word += " Programming";
        System.out.println("word = " + word);
//-------------------------------------------------------------
        int a = 20;
        System.out.println("a = " + a); //20
        a -= 10;
        System.out.println("a = " + a); //10
        a *= 4;
        System.out.println("a = " + a); //40
        a /=10;
        System.out.println("a = " + a); //4

        a %=3;
        System.out.println("a = " + a); //1
    }


}
