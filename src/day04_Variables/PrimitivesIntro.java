package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {
        //Variable names can not be Java reserved word
        // age:38 years old
        byte age=38;
        System.out.print("My age\t\t:");
        System.out.println(age);

        /* weight:160 pounds
          byte weight=160; 160 out of byte range
        */
        short weight=160;
        System.out.print("My weigh\t:");
        System.out.println(weight);

        // salary: 100000$; out of byte and short range
       int salary=100_000; // int is the preferred data type for integer numbers
        System.out.print("My salary\t:$ ");
        System.out.println(salary);

        // more than int range we need to use long
        long myAgeInSeconds=1_333_333_3333L; // default compiler takes as integer so add L after integer
        System.out.println(myAgeInSeconds-age*365*24*60*60);

        // tax: 0.26
        float tax =0.26F;

        //for decimals preferred type is double
        double dtax=0.26;

        // # for single char put inside single quotes ''
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);
        char ch2  = 35;
        System.out.println("ch2 = " + ch2);
        char ch3  = 1305;
        System.out.println("ch2 = " + ch3);

        // String is sequence of characters (String of text), use double quotes ""

    }


}
