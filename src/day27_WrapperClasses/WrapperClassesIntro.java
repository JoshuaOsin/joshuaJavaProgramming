package day27_WrapperClasses;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        int  num1 = 200;

        Integer n1 = num1; // Auto Boxing are loyal to TYPE, implicitly done

        int num2 = n1;  // Unboxing, implicitly done

        System.out.println("----------------");

        Integer integerValue = 100;

        long longValue = integerValue; // within the range it accepts

        System.out.println("-------------");

        Byte b1 = 25;

        byte a1 = b1;
        int a2 = b1;
        double a3 = b1;

        System.out.println("-------------------");

        int [] numbers1 = {1,2,3,4};
        Integer [] numbers2 = {1,2,3,4};



    }

}
