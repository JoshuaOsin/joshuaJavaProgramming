package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArray2 {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {7, 8, 9};

        int[][] arr2DArray1 = {arr1, arr2, arr3};

        //index of elements     0   1   2     0   1    2    0   1   2
        int[][] arr2DArray2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
                // index            0           1               2

        int[][][] arr3DArray = {arr2DArray1, arr2DArray2};
                        //index     0           1

        // print 3D array
        System.out.println(Arrays.deepToString(arr3DArray));
        System.out.println("--------- 2D----------");
        for (int[][] arr2D : arr3DArray) {
            System.out.println(Arrays.deepToString(arr2D));
        }
        System.out.println("------    single Array-------");

        System.out.println(Arrays.toString(arr3DArray[1][2]));

        System.out.println("--------  one elements ---");
        System.out.println(arr3DArray[0][2][2]);

        System.out.println("------------ each elements--------");
        for (int[][] arr2D : arr3DArray) {
            for (int[] eachArr : arr2D) {
                for (int element : eachArr) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }

        System.out.println("---------------- 4D arrays-----------");


    }
}
