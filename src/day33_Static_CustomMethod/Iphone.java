package day33_Static_CustomMethod;

public class Iphone {

    public static String brand = "Apple"; // not change

    public String model;
    public double price;
    public static String OS = "IOS"; // not change
    public String color;
    public String size;
    public static String madeIn = "China";  // common for all objects
    public static boolean hasBattery = true; // common for all objects
    public static boolean isTouchPad = true; // common for all objects
    public static boolean hasfaceTime = true; // common for all objects

    public static void specs(){
        System.out.println(brand);
        System.out.println(OS);
    }

    public static void printModelPrice(){
        //System.out.println(model +" : "+ price); // static cannot use instance variables
    }
    public  void printModelAndPrice(){
        System.out.println(model +" : "+ price);
    }


}
