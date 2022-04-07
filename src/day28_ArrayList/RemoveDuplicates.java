package day28_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {
        ArrayList < Integer > list = new ArrayList<>();

        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);

        ArrayList < Integer > result = new ArrayList<>();

        for (Integer each : list) {
            if (result.contains(each)) {
                continue;
            }
            result.add(each);
        }

        System.out.println(result);
    }

}
