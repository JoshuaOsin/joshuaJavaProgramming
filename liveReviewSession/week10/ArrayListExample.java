package week10;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        // to show auto boxing

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) { // i is primitive

            arr.add(i); // auto boxing: assign integer to Wrapper Class Integer
        }

    }
}
