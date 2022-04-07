package day06_PrimitiveTypeCasting;

public class ArithmeticOperators {

    public static void main(String[] args) {
        /*
        addition +
        subtraction -
        multiplication *
        division /
            in Math
                10/4    = 2.5
                10.0/4  = 2.5
            in Java
                10/4    = 2     // if we use integer numbers result will be casting integer automaticly
                10.0/4  = 2.5   // if we use double (decimal number) result will be double

        */
        System.out.println("10/4 when using integers \t= "+ 10/4);
        System.out.println("10.0/4 when using double \t= "+ 10.0/4);
        System.out.println("10%4 when using modulus % \t= "+ 10%4);
        System.out.println("10.0%4 when using modulus % \t= "+ 10.0%4);
        System.out.println("10/3 when using integers \t= "+ 10/3);
        System.out.println("10D/3 when casting double \t= "+ 10D/3);
        System.out.println("10%3 when using modulus % \t= "+ 10%3);     // remainder 1 since we used int
        System.out.println("10.0%3 when using modulus % \t= "+ 10.0%3); // remainder 1.0 since we used decimal

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1^b2);



    }


}
