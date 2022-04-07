package day06_PrimitiveTypeCasting;

public class PrimitiveCasting {

    public static void main(String[] args) {
        //implicit casting direcly/automaticly
        byte a = 10;
        short b = a;
        System.out.println(a+" : "+b);

        // explicit casting manually ALT+Enter (select cast to option by hitting Enter)
        double d1 = 20.5;
        short s1 = (short) d1;
        System.out.println(d1+" : "+s1); //20.5 : 20

        double n = 10.8;
        int s = (int) n;// Alt+enter+enter for explicit casting

        short x = 200;
        byte y = (byte)x;
        System.out.println(x+" : "+y);


    }
}
