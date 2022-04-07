package day10_NestedIF;

public class TernariesWithNestedIF {
    public static void main(String[] args) {

       int s =  90;

       String result = (s >= 0 && s <= 100)? ( s >= 60 ) ?
               "Passed" : "Failed" : "Invalid";

        System.out.println("result = " + result);
       }

    }
