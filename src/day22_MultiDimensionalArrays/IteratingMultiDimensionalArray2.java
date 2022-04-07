package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class IteratingMultiDimensionalArray2 {

    public static void main(String[] args) {

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};

        System.out.println(Arrays.deepToString(arr2D));

        System.out.println(" --------------- reverse array  -----------");
       // using for loop
        for (int i = arr2D.length - 1; i >= 0; i--) {
            //System.out.println(Arrays.toString(arr2D[i]));
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

        // using each loop
        System.out.println("-------- same by using for each loop----------");
        for (int i = arr2D.length - 1; i >= 0; i--) {
            //System.out.println(Arrays.toString(arr2D[i]));
            for (int j : arr2D[i]) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println(" --------- Reverse just element--------------------  ");
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" --------------- reverse array and elements -----------");
        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

    }
}
