package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {
        String[] group1 = {"Iroda", "Dijar"};
        String[] group2 = {"Ugur", "Eyup"};
        String[] group3 = {"Joshua", "Hajira"};


        String[][] groups = new String[3][]; // group index: 0,1,2
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

        System.out.println(Arrays.deepToString(groups));

        System.out.println("-------------------");

        //index of elements  0  1  2    0  1  2  3   0   1  2   3   4
        int[][] numbers = { {1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
                    //index    0          1               2
        // print multidimensional array use Arrays.deepToString
        System.out.println(Arrays.deepToString(numbers));

        // second array
        for (int i = 0; i < numbers[1].length; i++) {
            System.out.print(numbers[1][i]+ " ");
        }
        System.out.println();
        // print single array Arrays.toString
        System.out.println(Arrays.toString(numbers[1]));

        // 11
        // print element in any array numbers[i][j]....
        System.out.println("Our lucky number is " +numbers[2][3]);

    }
}
/*
    String  group1 ={ "John", "james"};
    String  group2 ={ "sam", "sally"};
    String  group3 ={ "John", "james"};

 */