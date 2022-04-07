package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "123";

        int number = Integer.parseInt(str); // int not unboxing nor autoboxing

        System.out.println(number+1);
        System.out.println(str+1);

        String str2 = "10.5";
        double num2= Double.parseDouble(str2);
        System.out.println(num2-1);

        System.out.println("--------------------");

        int max = Integer.MAX_VALUE;
        System.out.println("integer max "+ max);

        long min2 = Long.MIN_VALUE;
        System.out.println("long min2 = " + min2);

        String str3 = "TRUE";
        boolean isEligable = Boolean.parseBoolean(str3);
        System.out.println("isEligable = " + isEligable);

        System.out.println("----- valueOf method -----");

        String str4 = "123";

        Integer x = Integer.valueOf(str4);

        int y = Integer.valueOf(str4);

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        String str5 = "10.5";

        Double z = Double.parseDouble(str5);

        System.out.println("z = " + z);

        System.out.println("-----  isDigit method   -------------");

        char ch1 = '0';
        boolean r2 = Character.isDigit(ch1);

        System.out.println("ch1 = " + ch1);
        System.out.println("r2 = " + r2);




    }
}
