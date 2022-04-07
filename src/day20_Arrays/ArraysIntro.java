package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        // create a variable to store 5 names what are they UNKNOWN
        String[] myGroup = new String[5];
        // System.out.println(myGroup); // gives hash code

        myGroup[0] = "joshua";
        myGroup[1] = "suat";
        myGroup[2] = "hulya";
        myGroup[3] = "josh";
        myGroup[4] = "mikeal";

        System.out.println(Arrays.toString(myGroup));


    }
}
